package com.bridgelabz.hospitalmanagement.repository;

import com.bridgelabz.hospitalmanagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
