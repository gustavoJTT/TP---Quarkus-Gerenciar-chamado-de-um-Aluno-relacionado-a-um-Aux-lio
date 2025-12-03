package com.tpquarkus.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class AssistenteSocial extends PanacheEntity {

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    public String nome;

    @NotBlank(message = "A matrícula é obrigatória")
    @Column(nullable = false, unique = true)
    public String matricula;

    @Column(nullable = false)
    public Boolean ativo = true;
}
