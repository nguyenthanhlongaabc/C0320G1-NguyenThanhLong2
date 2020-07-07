package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String showDictionary() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public String showResult(@RequestParam String input, Model model) {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "xin chào");
        dic.put("apple", "táo");
        dic.put("orange", "cam");
        dic.put("pencil", "bút chì");
        String result = dic.get(input);
        model.addAttribute("result", result);
        return "result_dictionary";
    }
}
