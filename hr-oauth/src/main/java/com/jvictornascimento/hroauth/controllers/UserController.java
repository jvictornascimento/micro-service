package com.jvictornascimento.hroauth.controllers;

import com.jvictornascimento.hroauth.models.User;
import com.jvictornascimento.hroauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(value = "/search")
    public ResponseEntity<User> getbyEmail(@RequestParam String email){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findByEmail(email));
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
