package com.example.medicalbilling.repository;

import com.example.medicalbilling.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    List<Bill> findByPatientId(Long patientId);
    List<Bill> findByDoctorId(Long doctorId);
    List<Bill> findByStatus(String status);
}