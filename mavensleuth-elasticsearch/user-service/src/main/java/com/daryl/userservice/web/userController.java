package com.daryl.userservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daryl on 2018-08-04.
 */
@RestController
@RequestMapping("/user")
public class userController {

    @GetMapping("/hi")
    public String sayHi(){
        return "I'm daryl";
    }

}
