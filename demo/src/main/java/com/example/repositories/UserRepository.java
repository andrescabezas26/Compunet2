package main.java.com.example.repositories;

import java.util.*;

import main.java.com.example.demo.model.User;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
    }
    
    public List<User> getUsers() {
        return users;
    }

}
