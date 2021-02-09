package org.geeksforgeeks.springbeans.springbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/user2")
public class UserController2 {

    @Autowired
    UserConfig config;

    // In case of object name is users and scope is singleton
    // At startup : In UserConfig class : In getMyUser() function and Component User Object : org.geeksforgeeks.springbeans.springbeans.Users@987455b
    // and gBean User function : org.geeksforgeeks.springbeans.springbeans.Users@622fdb81

    // user2 API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@622fdb81
    // user API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@987455b

    @GetMapping
    public ResponseMessage getUser(){

        Users user = config.getMyUser();
        user.setAge(30);
        user.setName("DEF");
        System.out.println("Object Name : "+user);

        return new ResponseMessage(Collections.singletonList(user));
    }
}
