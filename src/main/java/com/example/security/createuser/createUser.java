package com.example.security.createuser;

import com.example.security.models.User;
import jakarta.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create")
public class createUser {

    @PostMapping("/createuser")
     public User createUser(@RequestBody User user) {
        System.out.println(user.toString());
         return  user;
    }

}
