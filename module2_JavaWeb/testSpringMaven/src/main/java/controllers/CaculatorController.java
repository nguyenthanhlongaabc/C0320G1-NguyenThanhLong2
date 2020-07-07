package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculator")
    public String caculator(){
        return "caculator";
    }

    @PostMapping("/caculator-result")
    public String result(@RequestParam double a, @RequestParam double b, @RequestParam String calculate, Model model){
        double result;
        switch (calculate){
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + calculate);
        }
        model.addAttribute("result",result);
        return "caculator-result";
    }
}
