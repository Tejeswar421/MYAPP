package com.example.security.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    String name ;
    String id;
    String password;
//     @JsonCreator
//    public User( @JsonProperty("name") String name,
//                 @JsonProperty("id") String id,
//                 @JsonProperty("password") String password) {
//         this.name = name;
//         this.id = id;
//         this.password = password;
//     }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
