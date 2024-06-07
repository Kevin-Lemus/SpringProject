package com.miappweb.miweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miappweb.miweb.model.dto.UserDto;
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

    @GetMapping("/details-dto")
    public void detailsDto(Model model){
        UserDto userDto = new UserDto(); 
        User user = new User("Kevin", "Cruz");

        userDto.setUser(user);
        userDto.setTitle("Detalles desde DTO");

        model.addAttribute("userDto", userDto);
    }

    @GetMapping("/list")
    public String list(Model model){
        User user1 = new User("Kevin", "Cruz");
        User user2 = new User("Nombre2", "Apellido2");
        User user3 = new User("Nombre3", "Apellido3");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        model.addAttribute("title", "Lista de Usuarios");
        model.addAttribute("users", users);
        return "list";
    }
}
