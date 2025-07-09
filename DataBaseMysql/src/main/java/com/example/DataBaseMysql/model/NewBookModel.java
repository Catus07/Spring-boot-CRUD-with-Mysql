package com.example.DataBaseMysql.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class NewBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    @NotNull(message = "cant be null")
    private int year;
    private String author;

    @Transient
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
