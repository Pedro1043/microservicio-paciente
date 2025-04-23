package com.medes.patient.api;

import com.medes.patient.domain.entity.MedicalData;
import com.medes.patient.domain.service.MedicalDataService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/medicalData")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174"})
public class MedicalDataController {
    private final MedicalDataService medicalDataService;

    @GetMapping("/getAll")
    public List<MedicalData> fetchAll() {
        return medicalDataService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicalData> fetchById(@PathVariable Long id) {
        Optional<MedicalData> medicalData = medicalDataService.getById(id);
        return medicalData.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<MedicalData> create(@RequestBody MedicalData medicalData) {
        return new ResponseEntity<>(medicalDataService.save(medicalData), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        medicalDataService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Nuevo endpoint para obtener datos médicos por idPaciente
    @GetMapping("/patient/{idPaciente}")
    public ResponseEntity<List<MedicalData>> fetchByPatientId(@PathVariable Long idPaciente) {
        List<MedicalData> medicalDataList = medicalDataService.getByPatientId(idPaciente);
        if (medicalDataList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(medicalDataList);
    }
}