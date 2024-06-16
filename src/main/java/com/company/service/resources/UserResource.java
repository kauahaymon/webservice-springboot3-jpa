package com.company.service.resources;

import com.company.service.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> listAll() {
        User user = new User(
                1L,
                "Bob Marley",
                "bobmarley@gmail.com",
                "99999-9999",
                "12345"
        );
        return ResponseEntity.ok().body(user);
    }
}
