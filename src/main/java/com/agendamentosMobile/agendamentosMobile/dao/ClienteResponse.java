package com.agendamentosMobile.agendamentosMobile.dao;

import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;

public class ClienteResponse {
    @NotNull
    private String nomeCliente;
    @NotNull
    private String celularCliente;
    private String emailCliente;

    public ClienteResponse(){};

    public ClienteResponse(String nomeCliente, String celularCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.celularCliente = celularCliente;
        this.emailCliente = emailCliente;
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
