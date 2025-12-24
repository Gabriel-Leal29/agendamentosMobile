package com.agendamentosMobile.agendamentosMobile.repository;

import com.agendamentosMobile.agendamentosMobile.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    boolean existsByData(LocalDateTime data); //verifica se existe um agendamento com mesma data
}
