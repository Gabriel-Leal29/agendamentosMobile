package com.agendamentosMobile.agendamentosMobile.controller;

import com.agendamentosMobile.agendamentosMobile.DTO.ClienteRequest;
import com.agendamentosMobile.agendamentosMobile.DTO.ClienteResponse;
import com.agendamentosMobile.agendamentosMobile.model.Cliente;
import com.agendamentosMobile.agendamentosMobile.repository.ClienteRepository;
import com.agendamentosMobile.agendamentosMobile.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<ClienteResponse> criarCliente(@Valid @RequestBody ClienteRequest clienteRequest) {
        ClienteResponse clienteResponse = clienteService.salvarCliente(clienteRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteResponse);
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponse>> listarClientes() {
        List<ClienteResponse> clienteResponses = clienteService.listarClientes();

        return ResponseEntity.ok(clienteResponses);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteResponse> atualizarCliente(@PathVariable Long id, @RequestBody ClienteRequest clienteRequest) {
        clienteService.editarCliente(id, clienteRequest);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
