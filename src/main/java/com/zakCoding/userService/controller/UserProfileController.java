package com.zakCoding.userService.controller;


import com.zakCoding.userService.entity.UserProfile;
import com.zakCoding.userService.service.UserService;
import com.zakCoding.userService.viewObj.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserProfileController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public UserProfile saveUser(@RequestBody UserProfile user){

       return userService.saveUserEntity(user);

    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable Long id){

        return userService.getUserAndDepartment(id);

    }

}
