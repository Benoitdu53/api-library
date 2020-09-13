package com.api.library.dto;

import com.api.library.model.Book;
import com.api.library.model.Emprunt;
import com.api.library.model.Library;

import java.util.ArrayList;
import java.util.List;

public class CopyDto {

    private Long id;
    private int number;
    private String format;
    private List<Emprunt> empruntList = new ArrayList<>();
    private BookDto bookDto;
    private LibraryDto libraryDto;

    public BookDto getBookDto() {
        return bookDto;
    }

    public void setBookDto(final BookDto bookDto) {
        this.bookDto = bookDto;
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

    public List<Emprunt> getEmpruntList() {
        return empruntList;
    }

    public void setEmpruntList(final List<Emprunt> empruntList) {
        this.empruntList = empruntList;
    }

    public LibraryDto getLibraryDto() {
        return libraryDto;
    }

    public void setLibraryDto(final LibraryDto libraryDto) {
        this.libraryDto = libraryDto;
    }
}
