package com.tpquarkus.DTO;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import com.tpquarkus.StatusChamado;

public class ChamadoDTO {
    public Long id;

    @NotBlank(message = "A descrição é obrigatória")
    public String descricao;

    public String resposta;
    public StatusChamado status;
    public LocalDateTime dataAbertura;
    public LocalDateTime dataAnalise;

    @NotNull(message = "O ID do aluno é obrigatório")
    public Long alunoId;

    public Long assistenteSocialId;

    @NotNull(message = "O ID do auxílio é obrigatório")
    public Long auxilioId;
}
