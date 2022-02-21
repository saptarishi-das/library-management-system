package com.library.usermanagement.controllers;

import com.library.usermanagement.models.UserDetails;
import com.library.usermanagement.repositories.UserDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserDetailsRepository userDetailRepository;

    @ResponseBody
    @PostMapping(path="/register",
            consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public UserDetails registerUser(@RequestBody UserDetails user) {
        userDetailRepository.save(user);
        return user;
    }

    @ResponseBody
    @PostMapping(path="/update",
            consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public void updateUser(@RequestBody UserDetails user) {
        userDetailRepository.save(user);
    }

    // @ResponseBody
    // @PostMapping(path="/deactivate",
    //         consumes=MediaType.APPLICATION_JSON_VALUE,
    //         produces=MediaType.APPLICATION_JSON_VALUE)
    // public void deactivateUser(@RequestBody UserDetails user) {
    //     user.setActive(false);
    //     userDetailRepository.save(user);
    // }
}
