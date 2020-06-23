package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String sandwich(){
        return "sandwich";
    }

    @PostMapping("/sandwich-condiments")
    public String save(@RequestParam (defaultValue = "null") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "condiment";
    }
}
