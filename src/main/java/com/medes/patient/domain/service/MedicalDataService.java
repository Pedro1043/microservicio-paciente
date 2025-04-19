package com.medes.patient.domain.service;

import com.medes.patient.domain.entity.MedicalData;

import java.util.List;
import java.util.Optional;

public interface MedicalDataService {
    List<MedicalData> getAll();

    Optional<MedicalData> getById(Long id);

    MedicalData save(MedicalData medicalData);

    void delete(Long id);
}