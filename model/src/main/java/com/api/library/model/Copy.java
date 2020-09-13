package com.api.library.model;

import javax.persistence.*;

@Entity
@Table(name = "copy")
public class Copy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "format")
    private String format;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @Override
    public String toString() {
        return "Copy{" +
                "id=" + id +
                ", number=" + number +
                ", format='" + format + '\'' +
                ", book=" + book +
                ", library=" + library +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(final String format) {
        this.format = format;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(final Library library) {
        this.library = library;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(final Book book) {
        this.book = book;
    }
}