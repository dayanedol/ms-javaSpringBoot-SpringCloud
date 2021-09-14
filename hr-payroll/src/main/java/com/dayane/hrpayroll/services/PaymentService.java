package com.dayane.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import com.dayane.hrpayroll.entities.Payment;
import com.dayane.hrpayroll.entities.Worker;
import com.dayane.hrpayroll.feignclients.WorkerFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){
        Worker worker =  workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(),worker.getDailyIncome(), days);
    }
}
