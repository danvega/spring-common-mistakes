package dev.danvega.one.todo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    List<Todo> findAll() {
        return List.of(new Todo(1,"Hello World!", false));
    }

}
