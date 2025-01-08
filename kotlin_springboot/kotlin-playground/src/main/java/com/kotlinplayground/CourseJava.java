package com.kotlinplayground;

public class CourseJava {

    private Integer id;
    private String name;
    private String author;

    public CourseJava(Integer id, String name, String author) {
        this. id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "CourseJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

