package com.example.province.controllers;

import com.example.province.entity.Customer;
import com.example.province.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
    private CustomerService customerService;
    @GetMapping("/")
    public ModelAndView listCustomer(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("customers",customerService.getAllCustomer(pageable));
        return modelAndView;
//        return new ModelAndView("/list","customers",customerService.getAllCustomer(pageable));
    }

    @GetMapping("/customer/delete/{id}")
    public String deteleCustomer(@PathVariable Long id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Succesfull!!");
        customerService.deleteCustomerById(id);
        return "redirect:/";
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer(){
        return new ModelAndView("create","customers",new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Create Succesfull!!");
        customerService.createCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("/customer/edit/{id}")
    public ModelAndView editCustomer(@PathVariable Long id){
        return new ModelAndView("edit","customers",customerService.getCustomerById(id));
    }

    @PostMapping("/customer/edit")
    public String updateCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","edit successfull!!");
        customerService.createCustomer(customer);
        return "redirect:/";
    }

}
