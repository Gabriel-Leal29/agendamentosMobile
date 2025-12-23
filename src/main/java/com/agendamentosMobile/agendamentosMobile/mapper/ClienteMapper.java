package com.agendamentosMobile.agendamentosMobile.mapper;

import com.agendamentosMobile.agendamentosMobile.dao.ClienteRequest;
import com.agendamentosMobile.agendamentosMobile.dao.ClienteResponse;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;

public class ClienteMapper {
    public static Cliente toEntity(ClienteRequest clienteRequest) {
        Cliente novoCliente = new Cliente();

        novoCliente.setNomeCliente(clienteRequest.getNomeCliente());
        novoCliente.setCelularCliente(clienteRequest.getCelularCliente());
        novoCliente.setEmailCliente(clienteRequest.getEmailCliente());

        return novoCliente;
    }

    public static ClienteResponse toResponse(Cliente cliente) {
        ClienteResponse novoClienteResponse = new ClienteResponse();

        novoClienteResponse.setCelularCliente(cliente.getCelularCliente());
        novoClienteResponse.setNomeCliente(cliente.getNomeCliente());
        novoClienteResponse.setEmailCliente(cliente.getEmailCliente());

      return novoClienteResponse;
    };
}
