
package com.hms.controller;

import ch.qos.logback.core.model.Model;
import com.hms.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.hms.repository.UserRepo;
import com.hms.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {

    @Autowired //(required=true)
    private UserService userService;

//    @GetMapping({" ","/"})
//    public String index(Model model){
//        return "index";
//    }
//
    @Autowired
    UserRepo userRepo;



    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        //check the email & phone in db, if not unique throws an error and don't save to DB
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> fetchUserList(){
        return userService.fetchUserList();
    }

    @GetMapping("/users/{id}")
    public User fetchUserById(@PathVariable("id") int userId ){
        return userService.fetchUserById(userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteById(@PathVariable("id") int userId){ userService.deleteById(userId);
        return "Deleted successfully!";
    }

    @PutMapping("/users/{id}")
    public User updateUserById(@PathVariable("id") int userId, @RequestBody User user){
       return userService.updateUserById(userId,user);}

    }
