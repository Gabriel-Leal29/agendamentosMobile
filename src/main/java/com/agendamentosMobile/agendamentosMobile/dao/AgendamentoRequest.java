package com.agendamentosMobile.agendamentosMobile.dao;

import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

public class AgendamentoRequest {
    @NotNull
    private Long idCliente;
    @NotNull
    private String servico;
    @NotNull
    private Date data;

    public AgendamentoRequest(){}

    public AgendamentoRequest(Long idCliente, String servico, Date data) {
        this.idCliente = idCliente;
        this.servico = servico;
        this.data = data;
    }
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
