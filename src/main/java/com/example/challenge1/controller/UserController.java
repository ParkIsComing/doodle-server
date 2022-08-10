package com.example.challenge1.controller;

import com.example.challenge1.domain.User;
import com.example.challenge1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {
    @Autowired
    UserService userService;

//    @RequestMapping(value = "/webapp/jsp/signup", method = RequestMethod.GET)
//    public String getsignup() {
//
//        return "signup";
//    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String postsignup(User user) {
        userService.join(user);

        return "redirect:/";
    }

    @GetMapping("/signup")
    public String getUserById(@RequestParam String userid) {

        return Integer.toString(userService.checkId(userid));
    }
}