package com.example.province.controllers;

import com.example.province.entity.Customer;
import com.example.province.service.CustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/")
    public ModelAndView listCustomer(@RequestParam(name = "search", required = false) String search , @PageableDefault(value = 3) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("list");
        if (search!=null){
            modelAndView.addObject("search",search);
            modelAndView.addObject("customers",customerService.getAllCustomerByName(search,pageable));
        }else {
            modelAndView.addObject("customers",customerService.getAllCustomer(pageable));
        }
        return modelAndView;
    }

    @GetMapping("/customer/delete/{id}")
    public String deteleCustomer(@PathVariable Long id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Succesfull!!");
        customerService.deleteCustomerById(id);
        return "redirect:/";
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomer(){
        return new ModelAndView("create","customer",new Customer());
    }

    @PostMapping("/create")
    public String saveCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult,
                               Model model,
                               RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            model.addAttribute("customer",customer);
            return "create";
        }
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
