package com.codegym.casestudymodule2javaweb.controllers;

import com.codegym.casestudymodule2javaweb.entity.Contract;
import com.codegym.casestudymodule2javaweb.entity.Customer;
import com.codegym.casestudymodule2javaweb.entity.Service;
import com.codegym.casestudymodule2javaweb.service.ContractService;
import com.codegym.casestudymodule2javaweb.service.CustomerService;
import com.codegym.casestudymodule2javaweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ServiceService serviceService;

    @ModelAttribute(name = "customers")
    public Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @ModelAttribute(name = "services")
    public Iterable<Service> getAllservice(){
        return serviceService.getAllService();
    }

    @GetMapping("/admin/contract")
    public ModelAndView pageContract(){
        return new ModelAndView("contract/list","contracts",contractService.getAllContract());
    }

    @GetMapping("/contract/create")
    public ModelAndView createContract(){
        return new ModelAndView("contract/create","contract", new Contract());
    }

    @PostMapping("/contract/create")
    public String saveCreateContract(@Validated @ModelAttribute Contract contract, BindingResult bindingResult,
                                     @RequestParam Long customerId,
                                     @RequestParam Long serviceId,
                                     RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("contract", contract);
            return "contract/create";
        }
        Customer customer = customerService.getCustomerById(customerId);
        contract.setCustomer(customer);
        Service service = serviceService.getServiceById(serviceId);
        contract.setService(service);
        contractService.saveContract(contract);
        redirectAttributes.addFlashAttribute("message","Create Successful !!");
        return "redirect:/admin/contract";
    }

}
