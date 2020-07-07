package com.codegym.thi_module2.controllers;

import com.codegym.thi_module2.entity.Customer;
import com.codegym.thi_module2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ModelAndView pageCustomer(@RequestParam(name = "searchCustomerCode", required = false) String searchCustomerCode,
                                     @RequestParam(name = "searchName",required = false) String searchName,
                                     @PageableDefault(value = 5) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        if (searchName != null){
            modelAndView.addObject("searchCustomerCode",searchCustomerCode);
            modelAndView.addObject("searchName",searchName);
            modelAndView.addObject("customers",customerService.getAllCustomerByCustomerCodeAndName(searchCustomerCode, searchName, pageable));
        }else {
            modelAndView.addObject("customers",customerService.getAllCustomer(pageable));
        }
        return modelAndView;
    }

    @GetMapping("customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable Long id){
        return new ModelAndView("customer/edit","customer",customerService.getCustomerById(id));
    }

    @PostMapping("/customer/edit")
    public String saveEditCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult,
                                   RedirectAttributes redirectAttributes,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("customer",customer);
            return "customer/edit";
        }
        customerService.saveCustomer(customer);
        redirectAttributes.addFlashAttribute("message","Edit Successful !!");
        return "redirect:/";
    }

    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Long id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Successful !!");
        customerService.deleteCustomer(id);
        return "redirect:/";
    }
}
