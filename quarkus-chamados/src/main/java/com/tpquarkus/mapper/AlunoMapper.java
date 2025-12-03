package com.tpquarkus.mapper;
import com.tpquarkus.DTO.AlunoDTO;
import com.tpquarkus.domain.Aluno;

public class AlunoMapper {

    public static AlunoDTO toDTO(Aluno aluno) {
        if (aluno == null) {
            return null;
        }
        AlunoDTO dto = new AlunoDTO();
        dto.id = aluno.id;
        dto.nome = aluno.nome;
        dto.matricula = aluno.matricula;
        dto.curso = aluno.curso;
        dto.ativo = aluno.ativo;
        return dto;
    }

    public static Aluno toEntity(AlunoDTO dto) {
        if (dto == null) {
            return null;
        }
        Aluno aluno = new Aluno();
        aluno.nome = dto.nome;
        aluno.matricula = dto.matricula;
        aluno.curso = dto.curso;
        aluno.ativo = dto.ativo != null ? dto.ativo : true;
        return aluno;
    }

    public static void updateEntity(Aluno aluno, AlunoDTO dto) {
        if (aluno == null || dto == null) {
            return;
        }
        aluno.nome = dto.nome;
        aluno.matricula = dto.matricula;
        aluno.curso = dto.curso;
        if (dto.ativo != null) {
            aluno.ativo = dto.ativo;
        }
    }
}
