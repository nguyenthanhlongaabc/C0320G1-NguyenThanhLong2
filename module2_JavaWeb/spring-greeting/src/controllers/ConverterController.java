package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/converter")
    public String converter(){
        return "converter";
    }
    @PostMapping("/result")
    public String result(@RequestParam double rate ,@RequestParam double usd , Model model){
        double result = rate*usd ;
        model.addAttribute("result", result);
        return "result_converter";
    }
}
