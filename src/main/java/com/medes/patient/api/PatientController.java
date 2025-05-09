package com.medes.patient.api;

import com.medes.patient.domain.entity.Patient;
import com.medes.patient.domain.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/patient")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5174"})
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/getAll")
    public List<Patient> fetchAll() {return patientService.getAll();}

    @GetMapping("/{idPaciente}")
    public Optional<Patient> fetchById (@PathVariable Long idPaciente) {return patientService.getById(idPaciente);}

    @PostMapping("/add")
    public ResponseEntity<Patient> create(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.save(patient), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{idPaciente}")
    public void delete(@PathVariable Long idPaciente){
        patientService.delete(idPaciente);
    }
}