package com.agendamentosMobile.agendamentosMobile.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.Date;

public class AgendamentoResponse {
    @NotNull
    private Long idAgendamento;
    @NotNull
    public String nomeClienteAgendamento;
    @NotNull
    public String servicoAgendamento;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    public LocalDateTime dataAgendamento;

    public AgendamentoResponse(){}

    public AgendamentoResponse(Long idAgendamento, String nomeClienteAgendamento, String servicoAgendamento, LocalDateTime dataAgendamento) {
        this.idAgendamento = idAgendamento;
        this.nomeClienteAgendamento = nomeClienteAgendamento;
        this.servicoAgendamento = servicoAgendamento;
        this.dataAgendamento = dataAgendamento;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Long idAgendamento) {
        this.idAgendamento = idAgendamento;
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

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }
}
