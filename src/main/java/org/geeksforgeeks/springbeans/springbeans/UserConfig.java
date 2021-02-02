package org.geeksforgeeks.springbeans.springbeans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class UserConfig {

    @Bean
    @Scope("prototype")
    public Users getMyUser(){
        System.out.println("In UserConfig class : In getMyUser() function.");
        return new Users();
    }
}
