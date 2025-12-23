package com.agendamentosMobile.agendamentosMobile.dao;

import org.antlr.v4.runtime.misc.NotNull;

public class ClienteRequest {
    private Long idCliente;
    @NotNull
    private String nomeCliente;
    @NotNull
    private String celularCliente;
    private String emailCliente;

    public ClienteRequest(Long idCliente, String nomeCliente, String celularCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.celularCliente = celularCliente;
        this.emailCliente = emailCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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
