package com.api.library.controller;

import com.api.library.dto.BookDto;
import com.api.library.mapper.BookMapper;
import com.api.library.model.Book;
import com.api.library.service.contract.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private BookService bookService;

    // -----------------------------------------------------  //

    @GetMapping(value = "books")
    public List<BookDto> displayBooks(){

        List<Book> books = bookService.getAllBooks();

        return BookMapper.INSTANCE.map(books);
    }

    @GetMapping(value = "books/{categorie}")
    public List<BookDto> displayBookByCategorie(@PathVariable("categorie") String categorie){

        List<Book> books = bookService.getBookByCategorie(categorie);

        return BookMapper.INSTANCE.map(books);
    }
}
