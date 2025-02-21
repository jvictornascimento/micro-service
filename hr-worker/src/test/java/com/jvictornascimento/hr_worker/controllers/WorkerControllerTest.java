package com.jvictornascimento.hr_worker.controllers;

import com.jvictornascimento.hr_worker.models.Worker;
import com.jvictornascimento.hr_worker.services.WorkerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class WorkerControllerTest {
    @Autowired
    private MockMvc mvc;

    @Mock
    private WorkerService service;

    @Test
    void findAllQuandoChamadoTemQueDevelverUmaListaDeWorkes() throws Exception {
        String json = """
                [
                          {
                            "id": 1,
                            "name": "joao victor",
                            "dailyIncome": 200.0
                          },
                          {
                            "id": 2,
                            "name": "Kimberly",
                            "dailyIncome": 250.0
                          },
                          {
                            "id": 3,
                            "name": "Jeferson",
                            "dailyIncome": 300.0
                          }
                        ]         
                """;

        mvc.perform(get("/workers"))
                .andExpect(status().isOk())
                .andExpect(content().json(json));

    }


    @Test
    void findByIdVereificaSeoEndpointRetornaUmWorkerPorId() throws Exception {
        String json = """
                {
                    "id": 1,
                    "name": "joao victor",
                    "dailyIncome": 200.0
                }         
                """;

        mvc.perform(get("/workers/1"))
                .andExpect(status().isOk())
                .andExpect(content().json(json));

    }
}