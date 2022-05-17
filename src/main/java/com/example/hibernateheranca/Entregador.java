package com.example.hibernateheranca;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
@DiscriminatorValue("ENTREGADOR")
public class Entregador extends Funcionario {
    @NotBlank
    @Column(name = "numero_cnh")
    private String numeroCNH;
    @NotBlank
    @Column(name = "categoria_cnh")
    private String categoriaCNH;
}
