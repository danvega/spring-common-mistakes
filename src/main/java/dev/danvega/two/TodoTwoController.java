package dev.danvega.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoTwoController {

    private final TodoTwoRepository todoRepository;

    public TodoTwoController(TodoTwoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    List<String> findAll() {
        return todoRepository.getTodos();
    }

}
