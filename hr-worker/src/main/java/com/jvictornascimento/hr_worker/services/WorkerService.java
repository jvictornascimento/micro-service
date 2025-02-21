package com.jvictornascimento.hr_worker.services;

import com.jvictornascimento.hr_worker.models.Worker;
import com.jvictornascimento.hr_worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository repository;

    public List<Worker> getAll(){
       return repository.findAll();
    }
    public Worker getOne(Long id){
        return repository.findById(id).get();
    }
}
