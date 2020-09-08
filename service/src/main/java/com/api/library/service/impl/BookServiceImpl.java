package com.api.library.service.impl;

import com.api.library.model.Book;
import com.api.library.repository.BookDao;
import com.api.library.service.contract.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    // ----------------- Injections des dépendances ----------------- //
    @Autowired
    private BookDao bookDao;

    // -----------------------------------------------------  //

    /**
     *
     * @return la liste des books
     */
    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book getBookById(final Long id) {
        return null;
    }

    @Override
    public Book addBook(final Book book) {
        return null;
    }

    @Override
    public List<Book> getBookByCategorie(final Long id) {
        return null;
    }

}
