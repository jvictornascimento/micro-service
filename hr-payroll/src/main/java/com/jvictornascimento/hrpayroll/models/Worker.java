package com.jvictornascimento.hrpayroll.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Worker {

    private Long id;
    private String name;
    private Double dailyIncome;
}
