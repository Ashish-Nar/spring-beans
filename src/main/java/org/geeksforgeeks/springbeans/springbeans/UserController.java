/*
package org.geeksforgeeks.springbeans.springbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Users user;


    @GetMapping
    public ResponseMessage getUser() {
        user.setAge(20);
        user.setName("ABC");

        System.out.println("Object Name : "+user);

        return new ResponseMessage(Collections.singletonList(user));
    }
}
*/
