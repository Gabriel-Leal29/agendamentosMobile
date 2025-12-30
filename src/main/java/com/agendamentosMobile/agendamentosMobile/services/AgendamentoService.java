package com.agendamentosMobile.agendamentosMobile.services;

import com.agendamentosMobile.agendamentosMobile.DTO.AgendamentoRequest;
import com.agendamentosMobile.agendamentosMobile.DTO.AgendamentoResponse;
import com.agendamentosMobile.agendamentosMobile.mapper.AgendamentoMapper;
import com.agendamentosMobile.agendamentosMobile.model.Agendamento;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import com.agendamentosMobile.agendamentosMobile.repository.AgendamentoRepository;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public AgendamentoResponse salvarAgendamento(AgendamentoRequest agendamentoRequest) {
        //buscando o cliente pelo ID
        Cliente cliente = clienteRepository.findById(agendamentoRequest.getClienteId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        //verificação de agendamento no passado
        if(agendamentoRequest.getData().isBefore(LocalDateTime.now())) {
            throw new RuntimeException("Não é permitido agendamento no passado!");
        }

        //verifica o horário
        if(agendamentoRepository.existsByData(LocalDateTime.from(agendamentoRequest.getData()))){
            throw new RuntimeException("Já existe um agendamento para este horário!");
        }

        Agendamento agendamento = AgendamentoMapper.toEntity(agendamentoRequest, cliente);

        return AgendamentoMapper.toResponse(agendamentoRepository.save(agendamento));
    }

    public List<AgendamentoResponse> listarTodosAgendamentos() {
        return agendamentoRepository.findAll().stream().map(AgendamentoMapper::toResponse).toList();
    }

    public void deletarAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }


}
