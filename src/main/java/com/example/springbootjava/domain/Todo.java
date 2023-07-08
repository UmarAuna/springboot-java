package com.example.springbootjava.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "todos")
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    
    private String content;
    
    protected Todo() {}
    
    public Todo(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}