package com.hms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RootController {

        @GetMapping (value = "/")
        public String rootMap() {
            return "Hello Spring CRUD!";
        }



        //Another way
        /*
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String rootMap(){
            return "Hello World!";
        }

        @RequestMapping(value = "/test", method = RequestMethod.GET)
        public String testURL(){
            return "Hello World!";
        }
       */

}



