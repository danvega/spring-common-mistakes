package dev.danvega.three;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
class TodoThreeController {

    private final TodoThreeService todoService;

    public TodoThreeController(TodoThreeService todoService) {
        this.todoService = todoService;
    }

    List<Todo> findAll() {
        return todoService.findAll();
    }
}
