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

/*    @Autowired
    UserConfig config;*/

    @Autowired
    Users users;
    //Users user;

// IN CASE OF USER OBJECT NAME IS getMyUser and scope of component is prorotype
// At startup : In UserConfig class : In getMyUser() function and Component User Object : org.geeksforgeeks.springbeans.springbeans.Users@987455b
// and Bean User function : org.geeksforgeeks.springbeans.springbeans.Users@622fdb81

// user2 API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@622fdb81
// user API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@622fdb81

// IN CASE OF USER OBJECT NAME IS users and scope of component is prototype

//In UserConfig class : In getMyUser() function and Component User Object : org.geeksforgeeks.springbeans.springbeans.Users@2ec3633f
// and Bean User function : org.geeksforgeeks.springbeans.springbeans.Users@1d5d5621

// user2 API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@1d5d5621
// user API call : Object Name : org.geeksforgeeks.springbeans.springbeans.Users@710eff18


    @GetMapping
    public ResponseMessage getUser() {
        //Users user = config.getMyUser();
        users.setAge(20);
        users.setName("ABC");

        System.out.println("Object Name : "+users);

        return new ResponseMessage(Collections.singletonList(users));
    }
}
