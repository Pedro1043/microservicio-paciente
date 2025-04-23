package com.medes.patient.domain.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "medical_data")
@Data
public class MedicalData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Relación muchos-a-uno con Patient
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    @JsonBackReference // Indica que esta es la parte "de referencia" de la relación
    private Patient patient;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @Column(name = "altura", nullable = false)
    private double altura;

    @Column(name = "peso", nullable = false)
    private double peso;

    @Column(name = "tension", nullable = false)
    private String tension;

    @Column(name = "frecuencia_respiratoria", nullable = false)
    private int frecuenciaRespiratoria;

    @Column(name = "frecuencia_cardiaca", nullable = false)
    private int frecuenciaCardiaca;

    @Column(name = "temperatura", nullable = false)
    private double temperatura;

    @Column(name = "examen_clinico_general", nullable = false, length = 500)
    private String examenClinicoGeneral;

    @Column(name = "tiempo_enfermedad", nullable = false, length = 100)
    private String tiempoEnfermedad;

    @Column(name = "signos_sintomas_principales", nullable = false, length = 500)
    private String signosSintomasPrincipales;

    @Column(name = "relato_cronologico", nullable = false, length = 1000)
    private String relatoCronologico;
}