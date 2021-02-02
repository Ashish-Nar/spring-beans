package org.geeksforgeeks.springbeans.springbeans;

import java.util.List;

public class ResponseMessage {

    List<Users> users;

    public ResponseMessage(List<Users> users) {
        this.users = users;
    }

   public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
