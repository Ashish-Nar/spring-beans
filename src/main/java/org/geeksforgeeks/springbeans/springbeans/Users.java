package org.geeksforgeeks.springbeans.springbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Component
//@Scope("prototype")
public class Users {

    private String name;
    private int age;

    public Users(){

    }

    /*public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
