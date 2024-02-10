package dev.danvega.four.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/four/todos")
class TodoFourController {

    private final TodoFourRepository todoRepository;

    public TodoFourController(TodoFourRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    Todo getTodoById(@PathVariable Integer id) {
        return todoRepository.findById(id);
    }

    @PostMapping("/")
    Todo addTodo(@RequestBody Todo todo) {
        // Add the todo to the repository
        return todo;
    }

    @PutMapping("/{id}")
    Todo updateTodo(@RequestBody Todo todo) {
        // Update the todo in the repository
        return todo;
    }

    @DeleteMapping("/deleteTodo/{id}")
    void deleteTodoById(@PathVariable Integer id) {
        // Delete the todo from the repository
    }

}
