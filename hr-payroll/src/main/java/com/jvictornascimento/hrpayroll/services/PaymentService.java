package com.jvictornascimento.hrpayroll.services;

import com.jvictornascimento.hrpayroll.feignClients.WorkerFeignClient;
import com.jvictornascimento.hrpayroll.models.Payment;
import com.jvictornascimento.hrpayroll.models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;
    public Payment getPayment(long workerId, int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(),worker.getDailyIncome(),days);
    }
}
