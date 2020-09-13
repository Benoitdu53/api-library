package com.api.library.controller;

import com.api.library.dto.BookDto;
import com.api.library.mapper.BookMapper;
import com.api.library.mapper.CategorieMapper;
import com.api.library.model.Book;
import com.api.library.service.contract.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private BookService bookService;

    // -----------------------------------------------------  //

    @RequestMapping(value = "books", method = RequestMethod.GET)
    public List<BookDto> displayBooks(){

        List<Book> books = bookService.getAllBooks();

        return BookMapper.INSTANCE.map(books);
    }

    @RequestMapping(value = "books/{categorie}", method = RequestMethod.GET)
    public List<Book> displayBookByCategorie(@PathVariable("categorie") String categorie){

        List<Book> books = bookService.getBookByCategorie(categorie);

        return books;
    }
}
