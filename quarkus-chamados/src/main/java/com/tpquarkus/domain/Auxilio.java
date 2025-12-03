package com.tpquarkus.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Auxilio extends PanacheEntity {

    @NotBlank(message = "O nome do auxílio é obrigatório")
    @Column(nullable = false)
    public String nome;

    @Column(length = 1000)
    public String descricao;

    @Column(nullable = false)
    public Boolean ativo = true;
}
