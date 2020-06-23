package com.example.demoblog.controllers;

import com.example.demoblog.entity.Blog;
import com.example.demoblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ModelAndView getHomeBlog(@RequestParam (name = "search", required = false) String search, @PageableDefault(value = 5) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("blog/index");
        if (search != null){
            Page<Blog> blogList = blogService.findAllBlogByName(search, pageable );
            modelAndView.addObject("blogs",blogList);
        }else {
            modelAndView.addObject("blogs", blogService.findAllBlog(pageable));
        }
        return modelAndView;
    }

    @GetMapping("/blog/delete/{id}")
    public String deleteBlog(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Delete Successful!!");
        blogService.deleteBlogById(id);
        return "redirect:/";
    }

    @GetMapping("/blog/edit/{id}")
    public ModelAndView getEditPage(@PathVariable Integer id){
        return new ModelAndView("/blog/edit", "blogs", blogService.getBlogById(id));
    }

    @PostMapping("/blog/edit")
    public String editBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Edit successful!!");
        blogService.saveBlog(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/create")
   public ModelAndView blogCreate(){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blogs" ,new Blog());
        return modelAndView ;
    }

    @PostMapping("/create")
    public ModelAndView addBlog(@ModelAttribute Blog blog , RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView("redirect:/") ;
        blogService.saveBlog(blog);
        redirectAttributes.addFlashAttribute("message","Thêm thành công !!");
        return modelAndView;
    }
}
