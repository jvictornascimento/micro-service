package com.jvictornascimento.hruser.controllers;

import com.jvictornascimento.hruser.models.User;
import com.jvictornascimento.hruser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService service;
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }
    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByEmail(email));
    }

}
