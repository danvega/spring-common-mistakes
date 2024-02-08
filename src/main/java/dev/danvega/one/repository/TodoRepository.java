package dev.danvega.one.repository;

import dev.danvega.one.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {
    public List<Todo> findAll() {
        return List.of(new Todo(1,"Hello World!", false));
    }
}
