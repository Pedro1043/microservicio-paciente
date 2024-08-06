package com.medes.patient.domain.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
public class AntecedentesMedicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAntecedenteMedico;
    @Column(name = "fechaAntecedenteMedico")
    private String fechaAntecedenteMedico;
    @Column (name = "descAntecedenteMedico")
    private String descAntecedenteMedico;

}
