package com.bridgelabz.hospitalmanagement.service;

import com.bridgelabz.hospitalmanagement.dto.PatientDto;
import com.bridgelabz.hospitalmanagement.entity.Patient;
import com.bridgelabz.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setName(patientDto.getName());
        patient.setAge(patientDto.getAge());
        patient.setGender(patientDto.getGender());
        patient.setDisease(patientDto.getDisease());
        patient.setAddress(patientDto.getAddress());
        patient.setPhoneNumber(patientDto.getPhoneNumber());

        Patient savedPatient = patientRepository.save(patient);

        return new PatientDto(
                savedPatient.getId(),
                savedPatient.getName(),
                savedPatient.getAge(),
                savedPatient.getGender(),
                savedPatient.getDisease(),
                savedPatient.getAddress(),
                savedPatient.getPhoneNumber()
        );
    }

    public List<PatientDto> getAllPatients() {
        return patientRepository.findAll().stream().map(patient -> new PatientDto(
                patient.getId(),
                patient.getName(),
                patient.getAge(),
                patient.getGender(),
                patient.getDisease(),
                patient.getAddress(),
                patient.getPhoneNumber()
        )).collect(Collectors.toList());
    }

    public PatientDto getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        return new PatientDto(
                patient.getId(),
                patient.getName(),
                patient.getAge(),
                patient.getGender(),
                patient.getDisease(),
                patient.getAddress(),
                patient.getPhoneNumber()
        );
    }

    public PatientDto updatePatient(Long id, PatientDto patientDto) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        patient.setName(patientDto.getName());
        patient.setAge(patientDto.getAge());
        patient.setGender(patientDto.getGender());
        patient.setDisease(patientDto.getDisease());
        patient.setAddress(patientDto.getAddress());
        patient.setPhoneNumber(patientDto.getPhoneNumber());

        Patient updatedPatient = patientRepository.save(patient);

        return new PatientDto(
                updatedPatient.getId(),
                updatedPatient.getName(),
                updatedPatient.getAge(),
                updatedPatient.getGender(),
                updatedPatient.getDisease(),
                updatedPatient.getAddress(),
                updatedPatient.getPhoneNumber()
        );
    }

    public String deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        patientRepository.delete(patient);
        return "Patient deleted successfully";
    }
}