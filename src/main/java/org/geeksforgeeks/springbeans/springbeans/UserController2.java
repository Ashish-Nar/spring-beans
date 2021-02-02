package org.geeksforgeeks.springbeans.springbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/user2")
public class UserController2 {

    @Autowired
    UserConfig config;


    @GetMapping
    public ResponseMessage getUser(){

        Users user = config.getMyUser();
        user.setAge(30);
        user.setName("DEF");
        System.out.println("Object Name : "+user);

        return new ResponseMessage(Collections.singletonList(user));
    }
}
