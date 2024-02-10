package dev.danvega.one.todo;

import java.util.List;

class TodoOneController {

    private final TodoOneRepository todoRepository;

    public TodoOneController(TodoOneRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    List<Todo> findAll() {
        return todoRepository.findAll();
    }
}
