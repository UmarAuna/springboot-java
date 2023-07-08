package com.example.springbootjava.repository;

import com.example.springbootjava.domain.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> { }