package dev.danvega.four.todo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class TodoFourRepository {

    private final List<Todo> todos = new ArrayList<>();

    public TodoFourRepository() {
        todos.add(new Todo(1,"Hello World!", false));
    }

    List<Todo> findAll() {
        return todos;
    }

    Todo findById(Integer id) {
        return todos.stream().filter(todo -> todo.getId().equals(id)).findFirst().orElse(null);
    }


}
