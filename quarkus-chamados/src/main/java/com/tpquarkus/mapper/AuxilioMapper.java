package com.tpquarkus.mapper;
import com.tpquarkus.DTO.AuxilioDTO;
import com.tpquarkus.domain.Auxilio;

public class AuxilioMapper {

    public static AuxilioDTO toDTO(Auxilio auxilio) {
        if (auxilio == null) {
            return null;
        }
        AuxilioDTO dto = new AuxilioDTO();
        dto.id = auxilio.id;
        dto.nome = auxilio.nome;
        dto.descricao = auxilio.descricao;
        dto.ativo = auxilio.ativo;
        return dto;
    }

    public static Auxilio toEntity(AuxilioDTO dto) {
        if (dto == null) {
            return null;
        }
        Auxilio auxilio = new Auxilio();
        auxilio.nome = dto.nome;
        auxilio.descricao = dto.descricao;
        auxilio.ativo = dto.ativo != null ? dto.ativo : true;
        return auxilio;
    }

    public static void updateEntity(Auxilio auxilio, AuxilioDTO dto) {
        if (auxilio == null || dto == null) {
            return;
        }
        auxilio.nome = dto.nome;
        auxilio.descricao = dto.descricao;
        if (dto.ativo != null) {
            auxilio.ativo = dto.ativo;
        }
    }
}
