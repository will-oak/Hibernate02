package com.example.hibernateheranca;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

@Entity
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_e_hora")
    private OffsetDateTime dataEHora;
    @OneToOne
    @NotNull
    private Atendente atendente;
    @OneToOne
    @NotNull
    private Cliente cliente;
}
