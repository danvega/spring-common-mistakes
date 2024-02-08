package dev.danvega.one.controller;

import dev.danvega.one.model.Todo;
import dev.danvega.one.repository.TodoRepository;

import java.util.List;

public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
