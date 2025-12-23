package com.agendamentosMobile.agendamentosMobile.repository;

import com.agendamentosMobile.agendamentosMobile.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
