package com.agendamentosMobile.agendamentosMobile.dao;

import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.Date;

public class AgendamentoRequest {
    @NotNull
    private Long clienteId;
    @NotNull
    private String servico;
    @NotNull
    private LocalDateTime data;

    public AgendamentoRequest(){}

    public AgendamentoRequest(Long clienteId, String servico, LocalDateTime data) {
        this.clienteId = clienteId;
        this.servico = servico;
        this.data = data;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
