package com.api.library.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "copy")
    private List<Emprunt> copyList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

    @Override
    public String toString() {
        return "Copy{" +
                "id=" + id +
                ", number=" + number +
                ", format='" + format + '\'' +
                ", copyList=" + copyList +
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

    public List<Emprunt> getCopyList() {
        return copyList;
    }

    public void setCopyList(final List<Emprunt> copyList) {
        this.copyList = copyList;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(final Library library) {
        this.library = library;
    }
}