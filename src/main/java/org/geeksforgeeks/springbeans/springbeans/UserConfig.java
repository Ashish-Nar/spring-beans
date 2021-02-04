package org.geeksforgeeks.springbeans.springbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfig {

    @Autowired
    Users user;

    @Bean
    public Users getMyUser(){
        System.out.println("In UserConfig class : In getMyUser() function.");
        //return new Users();
        return user;
    }
}
