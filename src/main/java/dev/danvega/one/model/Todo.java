package dev.danvega.one.model;

public class Todo {

    private final Integer id;
    private final String title;
    private final Boolean completed;

    public Todo(Integer id, String title, Boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
