package com.ericsson.apiprodutos.resources;


import com.ericsson.apiprodutos.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "ericsson", "dasilva.ericsson@gmail.com", "51998268579", "12345");
        return ResponseEntity.ok().body(u);
    }
}
