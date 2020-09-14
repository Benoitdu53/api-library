package com.api.library.dto;

import com.api.library.model.Emprunt;

import java.util.ArrayList;
import java.util.List;

public class CopyDto {

    private Long id;
    private int number;
    private String format;
    private List<Emprunt> empruntList = new ArrayList<>();
    private LibraryDto library;

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

    public LibraryDto getLibrary() {
        return library;
    }

    public void setLibrary(final LibraryDto library) {
        this.library = library;
    }
}
