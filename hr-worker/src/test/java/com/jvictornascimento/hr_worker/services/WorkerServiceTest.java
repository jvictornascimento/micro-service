package com.jvictornascimento.hr_worker.services;

import com.jvictornascimento.hr_worker.models.Worker;
import com.jvictornascimento.hr_worker.repositories.WorkerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class WorkerServiceTest {

    @InjectMocks
    private WorkerService service;
    @Mock
    private WorkerRepository repository;

    @Test
    void getAllQuandoChamadoDeveRetornarUmaListaComTodosWorkers() {
        List<Worker> workers = Arrays.asList(new Worker(1L,"Joao Victor",300.00),new Worker(2L,"Victor Nascimento",250.00));

        when(repository.findAll()).thenReturn(workers);

        List<Worker> result = service.getAll();

        assertEquals(workers, result);
    }

    @Test
    void getOneQuandoChamadoDeveRetornarUmUnicoWorker() {
        Worker worker = new Worker(1L,"Joao Victor",300.00);

        when(repository.findById(1L)).thenReturn(Optional.of(worker));

        Worker result = service.getOne(1L);

        assertEquals(worker, result);


    }
}