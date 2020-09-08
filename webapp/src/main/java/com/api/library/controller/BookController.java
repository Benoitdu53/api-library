package com.api.library.controller;

import com.api.library.model.Book;
import com.api.library.service.contract.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private BookService bookService;

    // -----------------------------------------------------  //

    @GetMapping(value = "books")
    public List<Book> displayBooks(){

        List<Book> books = bookService.getAllBooks();

        return books;
    }
}
