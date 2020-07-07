package com.example.demoproduct.controllers;

import com.example.demoproduct.models.Product;
import com.example.demoproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView getHomeProduct(){
        return new ModelAndView("/product/index","products", productService.getAllProduct());
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Successful!!");
        productService.deleteProductById(id);
        return "redirect:/";
    }

    @GetMapping("/product/edit/{id}")
    public ModelAndView getEditPage(@PathVariable Integer id){
        return new ModelAndView("/product/edit","products",productService.getProductById(id));
    }

    @PostMapping("/product/edit")
    public String editProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Edit Successful!!");
        productService.saveProduct(product);
        return "redirect:/";
    }
}
