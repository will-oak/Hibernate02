package com.example.hibernateheranca;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("ATENDENTE")
public class Atendente extends Funcionario {
    @NotNull
    @Column(name = "hora_entrada")
    private OffsetDateTime horarioEntrada;
    @NotNull
    @Column(name = "hora_saida")
    private OffsetDateTime horarioSaida;
    @NotBlank
    @Column(name = "email_institucional")
    private String emailInstituicional;
    @ManyToMany
    @NotNull
    private List<Cliente> clientes = new ArrayList<>();
}
