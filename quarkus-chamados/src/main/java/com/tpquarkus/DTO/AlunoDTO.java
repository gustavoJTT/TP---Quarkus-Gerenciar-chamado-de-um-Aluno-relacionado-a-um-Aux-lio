package com.tpquarkus.DTO;

import jakarta.validation.constraints.NotBlank;

public class AlunoDTO {
    public Long id;

    @NotBlank(message = "O nome é obrigatório")
    public String nome;

    @NotBlank(message = "A matrícula é obrigatória")
    public String matricula;

    @NotBlank(message = "O curso é obrigatório")
    public String curso;

    public Boolean ativo;
}
