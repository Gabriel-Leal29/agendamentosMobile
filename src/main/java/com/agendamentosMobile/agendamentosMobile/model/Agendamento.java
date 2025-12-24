package com.agendamentosMobile.agendamentosMobile.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_agendamento")
    private Long idAgendamento;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @NotNull
    @Column(name="servico")
    private String servico;
    @NotNull
    @Column(name="data_agendamento")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime data;

    public Agendamento() {}
    public Agendamento(Long idAgendamento, Cliente cliente, String servico, LocalDateTime data) {
        this.idAgendamento = idAgendamento;
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
    }

    public Long getIdAgendamento() {
        return idAgendamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Agendamento that)) return false;
        return Objects.equals(idAgendamento, that.idAgendamento);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAgendamento);
    }
}
