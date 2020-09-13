package com.api.library.dto;

import java.util.ArrayList;
import java.util.List;

public class CategorieDto {

    private Long id;
    private String label;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }
}
