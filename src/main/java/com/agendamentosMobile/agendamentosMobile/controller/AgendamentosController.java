package com.agendamentosMobile.agendamentosMobile.controller;

import com.agendamentosMobile.agendamentosMobile.dao.AgendamentoRequest;
import com.agendamentosMobile.agendamentosMobile.dao.AgendamentoResponse;
import com.agendamentosMobile.agendamentosMobile.model.Agendamento;
import com.agendamentosMobile.agendamentosMobile.repository.AgendamentoRepository;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import com.agendamentosMobile.agendamentosMobile.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentosController {
    @Autowired
    private AgendamentoService agendamentoService;
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @PostMapping
    public ResponseEntity<AgendamentoRequest> criarAgendamento(AgendamentoRequest agendamentoRequest) {
        AgendamentoResponse agendamentoResponse = agendamentoService.salvarAgendamento(agendamentoRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoRequest);
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoResponse>> listarAgendamentos() {
        List<AgendamentoResponse> agendamentoResponses = agendamentoService.listarTodosAgendamentos();

        return ResponseEntity.ok(agendamentoResponses);
    }

    @DeleteMapping("/{id}")
    public void deletarAgendamento(@PathVariable Long id) {
        agendamentoRepository.deleteById(id);
    }

}
