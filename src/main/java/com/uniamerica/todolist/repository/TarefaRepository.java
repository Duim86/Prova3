package com.uniamerica.todolist.repository;

import com.uniamerica.todolist.entity.ClienteEntity;
import com.uniamerica.todolist.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {

}
