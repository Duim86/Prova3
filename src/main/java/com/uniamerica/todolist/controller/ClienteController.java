package com.uniamerica.todolist.controller;

import com.uniamerica.todolist.entity.ClienteEntity;
import com.uniamerica.todolist.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @GetMapping
  public List<ClienteEntity> listAll() {
    return clienteRepository.findAll();
  }

  @GetMapping("/{clienteId}")
  public Optional<ClienteEntity> findById(@PathVariable Long clienteId) {
    return clienteRepository.findById(clienteId);
  }

  @PostMapping
  public ClienteEntity save(@RequestBody ClienteEntity cliente) {
    return clienteRepository.save(cliente);
  }
}
