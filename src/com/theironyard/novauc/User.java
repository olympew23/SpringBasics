package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by jerieshasmith on 2/28/17.
 */
public class User {
    String name;
    String password;
    ArrayList<Message> messages = new ArrayList<>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
