package com.jvictornascimento.hr_worker.controllers;

import com.jvictornascimento.hr_worker.models.Worker;
import com.jvictornascimento.hr_worker.repositories.WorkerRepository;
import com.jvictornascimento.hr_worker.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerService service;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable  long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getOne(id));
    }
}
