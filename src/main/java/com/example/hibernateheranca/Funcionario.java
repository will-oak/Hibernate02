package com.example.hibernateheranca;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "subtype", columnDefinition = "ENUM('ENTREGADOR','ATENDENTE')")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "identificacao_interna")
    private Long identificacaoInterna;
    @NotBlank
    private String nome;
    @NotNull
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    @NotNull
    private BigDecimal salario;
    @NotBlank
    private String telefone;

}
