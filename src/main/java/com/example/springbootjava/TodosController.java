package com.example.springbootjava;

import com.example.springbootjava.domain.Todo;
import com.example.springbootjava.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodosController {
    
    @Autowired
    TodoRepository todoRepository;
    
    @GetMapping("/")
    public String home(Model model) {
        var allTodos = todoRepository.findAll();
        model.addAttribute("title", "Welcome to Spring Boot on Railway!");
        model.addAttribute("todos", allTodos);
        return "home";
    }
    
    @PostMapping("/create")
    public String createTodo(@RequestParam String content) {
        Todo newTodo = new Todo(content);
        todoRepository.save(newTodo);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTodo(@RequestParam Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }
}
