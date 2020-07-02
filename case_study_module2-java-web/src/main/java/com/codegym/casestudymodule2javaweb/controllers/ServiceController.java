package com.codegym.casestudymodule2javaweb.controllers;

import com.codegym.casestudymodule2javaweb.entity.Service;
import com.codegym.casestudymodule2javaweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/admin/service")
    public ModelAndView pageService(@RequestParam(name = "search", required = false) String search,
                                    @PageableDefault(value = 5)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("service/list");
        if (search != null){
            modelAndView.addObject("search", search);
            modelAndView.addObject("services",serviceService.getAllServiceByName(search, pageable));
        }else {
            modelAndView.addObject("services", serviceService.getAllService(pageable));
        }
        return modelAndView;
    }

    @GetMapping("/service/create")
    public ModelAndView createService(){
        return new ModelAndView("service/create", "service", new Service());
    }

    @PostMapping("/service/create")
    public String saveCreateService(@Validated @ModelAttribute Service service, BindingResult bindingResult,
                                    RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("service",service);
            return "service/create";
        }
        serviceService.saveService(service);
        redirectAttributes.addFlashAttribute("message","Create Successful !!");
        return "redirect:/admin/service";
    }

    @GetMapping("/service/delete/{id}")
    public String deleteService(@PathVariable Long id, RedirectAttributes redirectAttributes){
        serviceService.deleteService(id);
        redirectAttributes.addFlashAttribute("message","Delete Successful !!");
        return "redirect:/admin/service";
    }

    @GetMapping("/service/edit/{id}")
    public ModelAndView editService(@PathVariable Long id){
        return new ModelAndView("service/edit","service",serviceService.getServiceById(id));
    }

    @PostMapping("/service/edit")
    public String saveEditService(@Validated @ModelAttribute Service service, BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()) {
            model.addAttribute("service", service);
            return "service/edit";
        }
        serviceService.saveService(service);
        redirectAttributes.addFlashAttribute("message","Edit Successful !!");
        return "redirect:/admin/service";
    }

}
