package com.agendamentosMobile.agendamentosMobile.repository;

import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    boolean existsByEmailCliente(String emailCliente);
    boolean existsByCelularCliente(String celularCliente);
}
