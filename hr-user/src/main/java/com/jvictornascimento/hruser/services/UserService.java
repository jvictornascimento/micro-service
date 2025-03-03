package com.jvictornascimento.hruser.services;

import com.jvictornascimento.hruser.models.User;
import com.jvictornascimento.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }
    public User getById(Long id){
        return repository.findById(id).get();
    }
    public User getByEmail(String email){
        return repository.findByEmail(email);
    }
}
