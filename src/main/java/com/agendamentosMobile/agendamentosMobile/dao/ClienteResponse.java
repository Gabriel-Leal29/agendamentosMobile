package com.agendamentosMobile.agendamentosMobile.dao;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

public class ClienteResponse {
    @NotNull
    private Long clienteId;

    @NotNull
    private String nomeCliente;
    @NotNull
    private String celularCliente;
    private String emailCliente;

    public ClienteResponse(){};

    public ClienteResponse(Long clienteId, String nomeCliente, String celularCliente, String emailCliente) {
        this.clienteId = clienteId;
        this.nomeCliente = nomeCliente;
        this.celularCliente = celularCliente;
        this.emailCliente = emailCliente;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
}
