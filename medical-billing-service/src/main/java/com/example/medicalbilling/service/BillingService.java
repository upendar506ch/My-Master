package com.example.medicalbilling.service;

import com.example.medicalbilling.model.Bill;
import com.example.medicalbilling.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillingService {

    private final BillRepository billRepository;

    @Autowired
    public BillingService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Optional<Bill> findBillById(Long id) {
        return billRepository.findById(id);
    }

    // Additional methods related to billing can be added here
}