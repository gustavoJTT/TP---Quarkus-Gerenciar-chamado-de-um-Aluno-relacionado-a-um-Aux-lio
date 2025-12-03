package com.tpquarkus.mapper;
import com.tpquarkus.DTO.ChamadoDTO;
import com.tpquarkus.domain.Chamado;
import java.time.LocalDateTime;

public class ChamadoMapper {

    public static ChamadoDTO toDTO(Chamado chamado) {
        if (chamado == null) {
            return null;
        }
        ChamadoDTO dto = new ChamadoDTO();
        dto.id = chamado.id;
        dto.descricao = chamado.descricao;
        dto.resposta = chamado.resposta;
        dto.status = chamado.status;
        dto.dataAbertura = chamado.dataAbertura;
        dto.dataAnalise = chamado.dataAnalise;

        dto.alunoId = chamado.aluno != null ? chamado.aluno.id : null;
        dto.assistenteSocialId = chamado.assistenteSocial != null ? chamado.assistenteSocial.id : null;
        dto.auxilioId = chamado.auxilio != null ? chamado.auxilio.id : null;
        return dto;
    }

    public static Chamado toEntity(ChamadoDTO dto) {
        if (dto == null) {
            return null;
        }
        Chamado chamado = new Chamado();
        chamado.descricao = dto.descricao;
        chamado.resposta = dto.resposta;
        chamado.status = dto.status;
        chamado.dataAbertura = dto.dataAbertura != null ? dto.dataAbertura : LocalDateTime.now();
        chamado.dataAnalise = dto.dataAnalise;
        return chamado;
    }

    public static void updateEntity(Chamado chamado, ChamadoDTO dto) {
        if (chamado == null || dto == null) {
            return;
        }
        chamado.descricao = dto.descricao;
        chamado.resposta = dto.resposta;
        if (dto.status != null) {
            chamado.status = dto.status;
        }
        chamado.dataAnalise = dto.dataAnalise;
    }

}
