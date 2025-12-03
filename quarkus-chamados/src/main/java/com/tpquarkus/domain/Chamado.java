package com.tpquarkus.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import com.tpquarkus.StatusChamado;

@Entity
public class Chamado extends PanacheEntity {

    @NotBlank(message = "A descrição é obrigatória")
    @Column(nullable = false, length = 2000)
    public String descricao;

    @Column(length = 2000)
    public String resposta;

    @NotNull(message = "O status é obrigatório")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public StatusChamado status = StatusChamado.ABERTO;

    @NotNull(message = "A data de abertura é obrigatória")
    @Column(nullable = false)
    public LocalDateTime dataAbertura;

    public LocalDateTime dataAnalise;

    @NotNull(message = "O aluno é obrigatório")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id", nullable = false)
    public Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assistente_social_id")
    public AssistenteSocial assistenteSocial;

    @NotNull(message = "O auxílio é obrigatório")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auxilio_id", nullable = false)
    public Auxilio auxilio;

}
