package com.medes.patient.domain.repository;

import com.medes.patient.domain.entity.MedicalData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalDataRepository extends JpaRepository<MedicalData, Long> {
}