package com.agendamentosMobile.agendamentosMobile.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public class AgendamentoResponse {
    @NotNull
    private Long idAgendamento;
    @NotNull
    private ClienteResponse cliente;
    @NotNull
    private String servicoAgendamento;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime dataAgendamento;

    public AgendamentoResponse(){}

    public AgendamentoResponse(Long idAgendamento, ClienteResponse cliente, String servicoAgendamento, LocalDateTime dataAgendamento) {
        this.idAgendamento = idAgendamento;
        this.cliente = cliente;
        this.servicoAgendamento = servicoAgendamento;
        this.dataAgendamento = dataAgendamento;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Long idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public ClienteResponse getCliente() {
        return cliente;
    }

    public void setCliente(ClienteResponse cliente) {
        this.cliente = cliente;
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
