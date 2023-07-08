package com.example.springbootjava.repository;

import com.example.springbootjava.domain.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAll();
}