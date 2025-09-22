package com.fsd.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {

    @Id
    @Column(name = "book_id")
    private int id;

    @Column(name = "book_name", nullable = false, length = 100)
    private String name;

    @Column(name = "book_author", nullable = false, length = 50)
    private String author;

    @Column(name = "book_year", nullable = false)
    private int year;

    @Column(name = "book_price", nullable = false)
    private double price;

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author +
               ", year=" + year + ", price=" + price + "]";
    }
}
