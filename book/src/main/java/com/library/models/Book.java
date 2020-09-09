package com.library.models;

public class Book {

    private Long id;
    private String name;
    private Author author;

    public Book() {
    }

    public Book(Long id, String name, Author author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
