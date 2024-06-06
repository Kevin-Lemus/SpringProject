package com.miappweb.miweb.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miappweb.miweb.models.User;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("title", "Mi Primera Web");
        model.addAttribute("nombre", "Kevin Cruz");
        model.addAttribute("profesion", "Desarrollador");

        return "home";
    }

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Kevin", "Cruz");

        model.addAttribute("title", "Mi Primera Web");
        model.addAttribute("user", user);

        return "details";
    }
}
