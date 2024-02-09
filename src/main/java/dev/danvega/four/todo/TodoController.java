package dev.danvega.four.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/getAllTodos")
    List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @GetMapping("/getTodoById/{id}")
    Todo getTodoById(@PathVariable Integer id) {
        return todoRepository.findById(id);
    }

    @PostMapping("/addTodo")
    Todo addTodo(@RequestBody Todo todo) {
        // Add the todo to the repository
        return todo;
    }

    @PutMapping("/updateTodo")
    Todo updateTodo(@RequestBody Todo todo) {
        // Update the todo in the repository
        return todo;
    }

    @DeleteMapping("/deleteTodo/{id}")
    void deleteTodoById(@PathVariable Integer id) {
        // Delete the todo from the repository
    }

}
