package com.medes.patient.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaciente;
    @Column(name = "apellidosPaciente")
    private String apellidosPaciente;
    @Column(name = "nombresPaciente")
    private String nombresPaciente;
    @Column(name = "celularPaciente")
    private String celularPaciente;
    @Column(name = "dniPaciente")
    private String dniPaciente;
    @Column(name = "direccionPaciente")
    private String direccionPaciente;
    @Column(name = "fechaNacimientoPaciente")
    private Date fechaNacimientoPaciente;
}