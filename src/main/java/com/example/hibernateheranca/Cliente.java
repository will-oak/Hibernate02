package com.example.hibernateheranca;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String cpf;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotBlank
    private String email;
}
