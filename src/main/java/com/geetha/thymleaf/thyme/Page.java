package com.geetha.thymleaf.thyme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Page {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String home() {
        return "welcome";  // looks for welcome.html in templates
    }

    @PostMapping("/submitName")
    public String submitName(@RequestParam("userName") String userName, Model model) {
        String greetings = greetingService.generateMessage(userName);
        model.addAttribute("message", greetings);
        return "greeting"; // looks for greeting.html in templates
    }
}
