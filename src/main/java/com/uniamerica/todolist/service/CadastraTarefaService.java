package com.uniamerica.todolist.service;

import com.uniamerica.todolist.entity.ClienteEntity;
import com.uniamerica.todolist.entity.TarefaEntity;
import com.uniamerica.todolist.repository.ClienteRepository;
import com.uniamerica.todolist.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastraTarefaService {

  @Autowired
  private ClienteRepository clienteRepository;

  @Autowired
  private TarefaRepository tarefaRepository;

  public TarefaEntity salvar(TarefaEntity tarefa) {
    ClienteEntity cliente = clienteRepository.findById(tarefa.getCliente().getId())
            .orElseThrow(() -> new IllegalStateException("Usuário não encontrado"));

    tarefa.setCliente(cliente);
    return tarefaRepository.save(tarefa);
  }
}
