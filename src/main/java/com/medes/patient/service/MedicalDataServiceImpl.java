package com.medes.patient.service;

import com.medes.patient.domain.entity.MedicalData;
import com.medes.patient.domain.repository.MedicalDataRepository;
import com.medes.patient.domain.service.MedicalDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MedicalDataServiceImpl implements MedicalDataService {
    private final MedicalDataRepository medicalDataRepository;

    @Override
    public List<MedicalData> getAll() {
        return medicalDataRepository.findAll();
    }

    @Override
    public Optional<MedicalData> getById(Long id) {
        return medicalDataRepository.findById(id);
    }

    @Override
    public MedicalData save(MedicalData medicalData) {
        return medicalDataRepository.save(medicalData);
    }

    @Override
    public void delete(Long id) {
        medicalDataRepository.deleteById(id);
    }

    @Override
    public List<MedicalData> getByPatientId(Long idPaciente) {
        return medicalDataRepository.findByPatientIdPaciente(idPaciente); 
    }
}