package dev.danvega.five;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/five/todos")
class TodoFiveController {

    private final TodoFiveRepository todoRepository;

    public TodoFiveController(TodoFiveRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @GetMapping("/{id}")
    Todo findById(@PathVariable Integer id) {
        return todoRepository.findById(id);
    }

}
