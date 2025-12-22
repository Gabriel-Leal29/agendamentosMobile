package com.agendamentosMobile.agendamentosMobile.repository;

import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRespository extends JpaRepository<Cliente, Long> {
}
