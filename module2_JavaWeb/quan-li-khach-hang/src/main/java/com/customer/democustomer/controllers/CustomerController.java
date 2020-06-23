package com.customer.democustomer.controllers;

import com.customer.democustomer.models.Customer;
import com.customer.democustomer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/")
    public ModelAndView getHomeCustomer(){
        return new ModelAndView("customer/index","customers",customerService.getAllCustomer());
    }

    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Successful!!");
        customerService.deleteCustomerById(id);
        return "redirect:/";
    }

    @GetMapping("/customer/edit/{id}")
    public ModelAndView getEditPage(@PathVariable Integer id){
        return new ModelAndView("customer/edit", "customers", customerService.getCustomerById(id));
    }

    @PostMapping("/customer/edit")
    public String editCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Edit Successful!!");
        customerService.saveCustomer(customer);
        return "redirect:/";
    }

}
