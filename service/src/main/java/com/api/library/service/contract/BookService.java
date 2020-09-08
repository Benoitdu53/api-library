package com.api.library.service.contract;

import com.api.library.model.Book;

import java.util.List;

public interface BookService {

    /**
     *
     * @return  La liste de tout les livres
     */
    List<Book> getAllBooks();

    /**
     *
     * @param id du livre
     * @return le livre selon l'id
     */
    Book getBookById(Long id);

    /**
     *
     * @param book
     * @return  Ajoute un livre en base
     */
    Book addBook(Book book);

    /**
     *
     * @param id catégorie
     * @return  les livres selon la catégorie
     */
    List<Book> getBookByCategorie(Long id);

}
