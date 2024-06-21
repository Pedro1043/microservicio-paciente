package com.medes.patient.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idGenero;
    @Column(name = "descripcionGenero")
    private String descripcionGenero;
}
