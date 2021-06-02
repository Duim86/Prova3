package com.uniamerica.todolist.controller;

import com.uniamerica.todolist.entity.TarefaEntity;
import com.uniamerica.todolist.repository.TarefaRepository;
import com.uniamerica.todolist.service.CadastraTarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

  @Autowired
  private TarefaRepository tarefaRepository;

  @Autowired
  private CadastraTarefaService cadastraTarefa;

  @GetMapping
  public List<TarefaEntity> listAll() {
    return tarefaRepository.findAll();
  }

  @GetMapping("/{clienteId}")
  public List<TarefaEntity> listByClienteId(@PathVariable Long clienteId){
    return tarefaRepository.findByClienteId(clienteId);
  }

  @PostMapping
  public TarefaEntity save(@RequestBody TarefaEntity tarefa) {

    return cadastraTarefa.salvar(tarefa);
  }
}
