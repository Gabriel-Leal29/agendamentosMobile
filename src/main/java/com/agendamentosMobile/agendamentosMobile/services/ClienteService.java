package com.agendamentosMobile.agendamentosMobile.services;

import com.agendamentosMobile.agendamentosMobile.dao.ClienteRequest;
import com.agendamentosMobile.agendamentosMobile.dao.ClienteResponse;
import com.agendamentosMobile.agendamentosMobile.mapper.ClienteMapper;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClienteService {
    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ClienteResponse salvarCliente(@Valid @RequestBody ClienteRequest clienteRequest) {
        Cliente cliente = ClienteMapper.toEntity(clienteRequest);

        return ClienteMapper.toResponse(clienteRepository.save(cliente));
    };
}
