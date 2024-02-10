package dev.danvega.three;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class TodoThreeService {

    List<Todo> findAll() {
        return List.of(new Todo(1, "Learn Spring Boot", true));
    }

}
