package com.agendamentosMobile.agendamentosMobile.mapper;

import com.agendamentosMobile.agendamentosMobile.DTO.AgendamentoRequest;
import com.agendamentosMobile.agendamentosMobile.DTO.AgendamentoResponse;
import com.agendamentosMobile.agendamentosMobile.model.Agendamento;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;

public class AgendamentoMapper {
    public static Agendamento toEntity(AgendamentoRequest agendamentoRequest, Cliente cliente) {
        Agendamento novoAgendamento = new Agendamento();

        novoAgendamento.setCliente(cliente);
        novoAgendamento.setServico(agendamentoRequest.getServico());
        novoAgendamento.setData(agendamentoRequest.getData());

        return novoAgendamento;
    }

    public static AgendamentoResponse toResponse(Agendamento agendamento){
        ClienteMapper clienteMapper = new ClienteMapper();
        AgendamentoResponse novoAgendamentoResponse = new AgendamentoResponse();

        novoAgendamentoResponse.setIdAgendamento(agendamento.getIdAgendamento());
        novoAgendamentoResponse.setDataAgendamento(agendamento.getData());
        novoAgendamentoResponse.setServicoAgendamento(agendamento.getServico());
        novoAgendamentoResponse.setCliente(clienteMapper.toResponse(agendamento.getCliente()));

        return novoAgendamentoResponse;
    }
}
