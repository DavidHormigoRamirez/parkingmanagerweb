package com.parkingmanager.parkingmanagerweb.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;


    @GetMapping("/users")
    public String showAllUsers(Model model){

        List<User> allUsers = repository.getAll();

        model.addAttribute("users",allUsers);
        return "userlist";

    }
    
}