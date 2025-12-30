package com.agendamentosMobile.agendamentosMobile.services;

import com.agendamentosMobile.agendamentosMobile.DTO.ClienteRequest;
import com.agendamentosMobile.agendamentosMobile.DTO.ClienteResponse;
import com.agendamentosMobile.agendamentosMobile.mapper.ClienteMapper;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import com.agendamentosMobile.agendamentosMobile.repository.AgendamentoRepository;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public ClienteResponse salvarCliente(ClienteRequest clienteRequest) {
        Cliente cliente = ClienteMapper.toEntity(clienteRequest);

        //verifica se tem cliente com esse celular ja cadastrado
        if(clienteRepository.existsByCelularCliente(clienteRequest.getCelularCliente())){
            throw new RuntimeException("Celular ja cadastrado");
        }

        return ClienteMapper.toResponse(clienteRepository.save(cliente));
    }

    public void deletarCliente(Long id) {
        boolean hasAgendamentos = agendamentoRepository.existsByClienteIdCliente(id);
        if (hasAgendamentos) {
            throw new RuntimeException("Cliente possui agendamentos e não pode ser deletado");
        }
        clienteRepository.deleteById(id);
    }

    public void editarCliente(Long id, ClienteRequest clienteRequest) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado")); //verifica se existe um cliente com esse ID

        cliente.setNomeCliente(clienteRequest.getNomeCliente());
        cliente.setEmailCliente(clienteRequest.getEmailCliente());
        cliente.setCelularCliente(clienteRequest.getCelularCliente());

        clienteRepository.save(cliente);
    }

    public List<ClienteResponse> listarClientes() {
        return clienteRepository.findAll().stream().map(ClienteMapper::toResponse).toList();
    }
}
