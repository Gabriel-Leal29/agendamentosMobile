package com.agendamentosMobile.agendamentosMobile.mapper;

import com.agendamentosMobile.agendamentosMobile.dao.AgendamentoRequest;
import com.agendamentosMobile.agendamentosMobile.dao.AgendamentoResponse;
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
        AgendamentoResponse novoAgendamentoResponse = new AgendamentoResponse();

        novoAgendamentoResponse.setDataAgendamento(agendamento.getData());
        novoAgendamentoResponse.setServicoAgendamento(agendamento.getServico());
        novoAgendamentoResponse.setNomeClienteAgendamento(agendamento.getCliente().getNomeCliente());

        return novoAgendamentoResponse;
    }
}
