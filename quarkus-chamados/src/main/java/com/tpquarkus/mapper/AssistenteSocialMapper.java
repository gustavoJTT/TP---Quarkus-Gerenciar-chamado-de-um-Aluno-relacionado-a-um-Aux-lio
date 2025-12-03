package com.tpquarkus.mapper;
import com.tpquarkus.DTO.AssistenteSocialDTO;
import com.tpquarkus.domain.AssistenteSocial;

public class AssistenteSocialMapper {

    public static AssistenteSocialDTO toDTO(AssistenteSocial assistenteSocial) {
        if (assistenteSocial == null) {
            return null;
        }
        AssistenteSocialDTO dto = new AssistenteSocialDTO();
        dto.id = assistenteSocial.id;
        dto.nome = assistenteSocial.nome;
        dto.matricula = assistenteSocial.matricula;
        dto.ativo = assistenteSocial.ativo;
        return dto;
    }

    public static AssistenteSocial toEntity(AssistenteSocialDTO dto) {
        if (dto == null) {
            return null;
        }
        AssistenteSocial assistenteSocial = new AssistenteSocial();
        assistenteSocial.nome = dto.nome;
        assistenteSocial.matricula = dto.matricula;
        assistenteSocial.ativo = dto.ativo != null ? dto.ativo : true;
        return assistenteSocial;
    }

    public static void updateEntity(AssistenteSocial assistenteSocial, AssistenteSocialDTO dto) {
        if (assistenteSocial == null || dto == null) {
            return;
        }
        assistenteSocial.nome = dto.nome;
        assistenteSocial.matricula = dto.matricula;
        if (dto.ativo != null) {
            assistenteSocial.ativo = dto.ativo;
        }
    }
}
