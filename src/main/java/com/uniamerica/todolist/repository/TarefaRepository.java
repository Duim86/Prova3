package com.uniamerica.todolist.repository;

import com.uniamerica.todolist.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {
  List<TarefaEntity> findByClienteId(Long id);
}
