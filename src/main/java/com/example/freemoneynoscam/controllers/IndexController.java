package com.example.freemoneynoscam.controllers;


import com.example.freemoneynoscam.repository.repository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
public class IndexController {
    private repository rep = new repository();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @PostMapping("/test")
    public String test(@RequestParam("email") String email, RedirectAttributes attributes) {
        System.out.println(email);
        rep.getArr().add(email);
        attributes.addAttribute("email", email);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(@RequestParam("email") String email, Model model) {
        model.addAttribute("email",email);
        model.addAttribute("emails",rep.toString());
        return "/success";
    }

}
