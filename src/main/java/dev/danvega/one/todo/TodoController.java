package dev.danvega.one.todo;

import java.util.List;

class TodoController {

    private final TodoRepository todoRepository;

    TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
