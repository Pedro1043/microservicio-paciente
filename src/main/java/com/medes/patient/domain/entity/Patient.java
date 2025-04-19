package com.medes.patient.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "patients")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaciente;
    @Column(name = "dniPaciente")
    private String dniPaciente;
    @Column(name = "nombresPaciente")
    private String nombresPaciente;
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @Column(name = "fechaNacimientoPaciente")
    private String fechaNacimientoPaciente;
    @Column(name = "edadPaciente")
    private int edadPaciente;
    @Column(name = "sexoPaciente")
    private String sexoPaciente;
    @Column(name = "celularPaciente")
    private String celularPaciente;
    @Column(name = "emailPaciente")
    private String emailPaciente;
    @Column(name = "antecedenteFamiliarPaciente")
    private String antecedenteFamiliarPaciente;

    // Relacióon uno-a-muchos con MedicalData
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference // Indica que esta es la parte "gestionada" de la relación
    private List<MedicalData> medicalDataList;
}
