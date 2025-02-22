package com.jvictornascimento.hrpayroll.services;

import com.jvictornascimento.hrpayroll.models.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Joao Victor",200.0,days);
    }
}
