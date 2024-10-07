//package com.hms.controller;
//
//import com.hms.model.User;
//import com.hms.repository.IndexRepo;
//import com.hms.service.IndexService;
//import com.hms.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Controller
//public class IndexController {
//
//    @GetMapping("/")
//    public String home() {
//        return "index";
//    }
//    @Autowired
//    IndexRepo indexRepo;
//    @Autowired //(required=true)
//    private IndexService indexService;
//
//    @PostMapping("/users")
//    public User saveUser(@RequestBody User user){
//        //check the email & phone in db, if not unique throws an error and don't save to DB
//        return indexService.saveUser(user);
//    }
//}
//
////    @PostMapping("/user")
////    public User saveUser(@RequestBody User user){
////    System.out.println(user.toString());
////    return "index";
////    }
//
////@PostMapping("/users")
////public User saveUser(@RequestBody User user){
////    return userService.saveUser(user);
////}
//
//
