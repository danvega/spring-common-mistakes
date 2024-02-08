package dev.danvega.two;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    private final List<String> todos = List.of("Learn Spring Boot", "Learn Spring MVC", "Learn Spring REST", "Learn to write tests");

    public List<String> getTodos() {
        return todos;
    }

}
