package dev.danvega.five;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
class TodoFiveRepository {

    private final List<Todo> todos = new ArrayList<>();

    public TodoFiveRepository() {
        todos.add(new Todo(1,"Hello World!", false));
    }

    List<Todo> findAll() {
        return todos;
    }

    Todo findById(Integer id) {
        return todos.stream().filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElseThrow(TodoNotFoundException::new);
    }



}
