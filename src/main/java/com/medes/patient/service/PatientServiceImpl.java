package com.medes.patient.service;

import com.medes.patient.domain.entity.Patient;
import com.medes.patient.domain.repository.PatientRepository;
import com.medes.patient.domain.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getById(Long idPaciente) {
        return patientRepository.findById(idPaciente);
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public String delete(Long idPaciente){
        patientRepository.deleteById(idPaciente);
        return "Id : " + idPaciente + " delete";
    }
}
