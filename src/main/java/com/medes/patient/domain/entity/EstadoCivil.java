package com.medes.patient.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEstadoCivil;
    @Column(name = "descripcionEstadoCivil")
    private String descripcionEstadoCivil;
}
