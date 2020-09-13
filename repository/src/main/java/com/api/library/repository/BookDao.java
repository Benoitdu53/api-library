package com.api.library.repository;

import com.api.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {

    // Récupère la liste des books
    @Query("SELECT b FROM Book b")
    List<Book> getAllBooks();

    @Query("SELECT b FROM Book b WHERE b.categorie.label = :categorie")
    List<Book> getBookByCategorie(@Param("categorie") String categorie);

}
