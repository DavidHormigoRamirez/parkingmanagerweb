package com.parkingmanager.parkingmanagerweb.user.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.service.*;;
@Controller
public class UserController {

    private UserService userService;
    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public String showAllUsers(Model model){

        Iterable<User> allUsers = userService.readAll();

        model.addAttribute("users",allUsers);
        return "userlist";

    }
    @GetMapping("/petazo")
    public String showPetazo() {
        return "petazo";
    }
    
}
