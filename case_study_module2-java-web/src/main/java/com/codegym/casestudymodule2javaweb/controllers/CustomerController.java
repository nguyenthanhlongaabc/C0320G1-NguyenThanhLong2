package com.codegym.casestudymodule2javaweb.controllers;

import com.codegym.casestudymodule2javaweb.entity.Customer;
import com.codegym.casestudymodule2javaweb.entity.TypeCustomer;
import com.codegym.casestudymodule2javaweb.service.CustomerService;
import com.codegym.casestudymodule2javaweb.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private TypeCustomerService typeCustomerService;

    @ModelAttribute(name = "customerTypes")
    public Iterable<TypeCustomer> getAllTypeCustomer(){
        return typeCustomerService.getAllTypeCustomer();
    }

    @GetMapping("/admin")
    public ModelAndView pageCustomer(@RequestParam(name = "searchName",required = false) String searchName,
                                     @RequestParam(name = "searchAddress",required = false) String searchAddress,
                                     @PageableDefault(value = 5)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (searchAddress != null) {
            modelAndView.addObject("searchName", searchName);
            modelAndView.addObject("searchAddress", searchAddress);
            modelAndView.addObject("customers", customerService.getAllCustomerByNameAndAddress(searchName, searchAddress, pageable));
        }else {
            modelAndView.addObject("customers",customerService.getAllCustomer(pageable));
        }
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String saveCreateCustomer(@RequestParam Long customerTypeId, @Validated @ModelAttribute Customer customer, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customer", customer);
            return "customer/create";
        }
        customer.setTypeCustomer(typeCustomerService.getTypeCustomerById(customerTypeId));
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message","Create Successful !!");
        return "redirect:/admin";
    }

    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Long id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Successful !!");
        customerService.deleteCustomer(id);
        return "redirect:/admin";
    }

    @GetMapping("/customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable Long id){
        return new ModelAndView("customer/edit","customer",customerService.getCustomerById(id));
    }

    @PostMapping("/customer/edit")
    public String saveEditCustomer(@RequestParam Long customerTypeId, @Validated @ModelAttribute Customer customer,
                                   BindingResult bindingResult,
                                   RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customer", customer);
            return "customer/edit";
        }
        customer.setTypeCustomer(typeCustomerService.getTypeCustomerById(customerTypeId));
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message", "Edit Successful !!");
        return "redirect:/admin";
    }
}
