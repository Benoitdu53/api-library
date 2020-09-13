package com.api.library.dto;

import java.util.ArrayList;
import java.util.List;

public class AuthorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private List<BookDto> bookDtoList = new ArrayList<>();

    public List<BookDto> getBookDtoList() {
        return bookDtoList;
    }

    public void setBookDtoList(final List<BookDto> bookDtoList) {
        this.bookDtoList = bookDtoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
}
