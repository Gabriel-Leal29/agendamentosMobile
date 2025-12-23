package com.agendamentosMobile.agendamentosMobile.services;

import com.agendamentosMobile.agendamentosMobile.dao.ClienteRequest;
import com.agendamentosMobile.agendamentosMobile.dao.ClienteResponse;
import com.agendamentosMobile.agendamentosMobile.mapper.ClienteMapper;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteResponse salvarCliente(ClienteRequest clienteRequest) {
        Cliente cliente = ClienteMapper.toEntity(clienteRequest);

        if (clienteRepository.existsByEmail(clienteRequest.getEmailCliente())) {
            throw new RuntimeException("Email já cadastrado");
        }


        return ClienteMapper.toResponse(clienteRepository.save(cliente));
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public List<ClienteResponse> listarClientes() {
        return clienteRepository.findAll().stream().map(ClienteMapper::toResponse).toList();
    }
}
