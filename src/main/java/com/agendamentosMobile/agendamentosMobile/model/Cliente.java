package com.agendamentosMobile.agendamentosMobile.model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Objects;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @NotNull
    private String nomeCliente;
    @NotNull
    private String celularCliente;
    private String emailCliente;

    public Cliente() {};

    public Cliente(Long idCliente, String nomeCliente, String celularCliente, String emailCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.celularCliente = celularCliente;
        this.emailCliente = emailCliente;
    };
    public Long getidCliente() {
        return idCliente;
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(idCliente, cliente.idCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCliente);
    }
}
