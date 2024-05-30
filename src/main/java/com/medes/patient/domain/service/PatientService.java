package com.medes.patient.domain.service;

import com.medes.patient.domain.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> getAll();

    Optional<Patient> getById(Long idPaciente);

    Patient save(Patient patient);

    String delete(Long idPaciente);
}
