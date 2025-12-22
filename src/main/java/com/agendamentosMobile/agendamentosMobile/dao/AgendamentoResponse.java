package com.agendamentosMobile.agendamentosMobile.dao;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

import java.util.Date;

public class AgendamentoResponse {
    @NotNull
    public String nomeClienteAgendamento;
    @NotNull
    public String servicoAgendamento;
    @NotNull
    public Date dataAgendamento;

    public AgendamentoResponse(){}

    public AgendamentoResponse(String nomeClienteAgendamento, String servicoAgendamento, Date dataAgendamento) {
        this.nomeClienteAgendamento = nomeClienteAgendamento;
        this.servicoAgendamento = servicoAgendamento;
        this.dataAgendamento = dataAgendamento;
    }

    public String getNomeClienteAgendamento() {
        return nomeClienteAgendamento;
    }

    public void setNomeClienteAgendamento(String nomeClienteAgendamento) {
        this.nomeClienteAgendamento = nomeClienteAgendamento;
    }

    public String getServicoAgendamento() {
        return servicoAgendamento;
    }

    public void setServicoAgendamento(String servicoAgendamento) {
        this.servicoAgendamento = servicoAgendamento;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
}
