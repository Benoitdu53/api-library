package com.api.library.mapper;

import com.api.library.dto.AuthorDto;
import com.api.library.dto.BookDto;
import com.api.library.dto.CategorieDto;
import com.api.library.dto.CopyDto;
import com.api.library.dto.LibraryDto;
import com.api.library.model.Author;
import com.api.library.model.Book;
import com.api.library.model.Categorie;
import com.api.library.model.Copy;
import com.api.library.model.Library;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-14T23:41:32+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public List<BookDto> map(List<Book> books) {
        if ( books == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( books.size() );
        for ( Book book : books ) {
            list.add( bookToBookDto( book ) );
        }

        return list;
    }

    @Override
    public BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setAuthor( authorToAuthorDto( book.getAuthor() ) );
        bookDto.setCategorie( categorieToCategorieDto( book.getCategorie() ) );
        bookDto.setId( book.getId() );
        bookDto.setTitle( book.getTitle() );
        bookDto.setPubDate( book.getPubDate() );
        bookDto.setPage( book.getPage() );
        bookDto.setSynopsis( book.getSynopsis() );
        bookDto.setCover( book.getCover() );
        bookDto.setCopyList( copyListToCopyDtoList( book.getCopyList() ) );

        return bookDto;
    }

    @Override
    public Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setCopyList( copyDtoListToCopyList( bookDto.getCopyList() ) );
        book.setAuthor( authorDtoToAuthor( bookDto.getAuthor() ) );
        book.setCategorie( categorieDtoToCategorie( bookDto.getCategorie() ) );
        book.setId( bookDto.getId() );
        book.setTitle( bookDto.getTitle() );
        book.setPubDate( bookDto.getPubDate() );
        book.setPage( bookDto.getPage() );
        book.setSynopsis( bookDto.getSynopsis() );
        book.setCover( bookDto.getCover() );

        return book;
    }

    protected AuthorDto authorToAuthorDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( author.getId() );
        authorDto.setFirstName( author.getFirstName() );
        authorDto.setLastName( author.getLastName() );

        return authorDto;
    }

    protected CategorieDto categorieToCategorieDto(Categorie categorie) {
        if ( categorie == null ) {
            return null;
        }

        CategorieDto categorieDto = new CategorieDto();

        categorieDto.setId( categorie.getId() );
        categorieDto.setLabel( categorie.getLabel() );

        return categorieDto;
    }

    protected LibraryDto libraryToLibraryDto(Library library) {
        if ( library == null ) {
            return null;
        }

        LibraryDto libraryDto = new LibraryDto();

        libraryDto.setId( library.getId() );
        libraryDto.setNom( library.getNom() );
        libraryDto.setAdress( library.getAdress() );
        libraryDto.setPhoneNum( library.getPhoneNum() );
        libraryDto.setEmail( library.getEmail() );

        return libraryDto;
    }

    protected CopyDto copyToCopyDto(Copy copy) {
        if ( copy == null ) {
            return null;
        }

        CopyDto copyDto = new CopyDto();

        copyDto.setId( copy.getId() );
        copyDto.setNumber( copy.getNumber() );
        copyDto.setFormat( copy.getFormat() );
        copyDto.setLibrary( libraryToLibraryDto( copy.getLibrary() ) );

        return copyDto;
    }

    protected List<CopyDto> copyListToCopyDtoList(List<Copy> list) {
        if ( list == null ) {
            return null;
        }

        List<CopyDto> list1 = new ArrayList<CopyDto>( list.size() );
        for ( Copy copy : list ) {
            list1.add( copyToCopyDto( copy ) );
        }

        return list1;
    }

    protected Library libraryDtoToLibrary(LibraryDto libraryDto) {
        if ( libraryDto == null ) {
            return null;
        }

        Library library = new Library();

        library.setId( libraryDto.getId() );
        library.setNom( libraryDto.getNom() );
        library.setAdress( libraryDto.getAdress() );
        library.setPhoneNum( libraryDto.getPhoneNum() );
        library.setEmail( libraryDto.getEmail() );

        return library;
    }

    protected Copy copyDtoToCopy(CopyDto copyDto) {
        if ( copyDto == null ) {
            return null;
        }

        Copy copy = new Copy();

        copy.setId( copyDto.getId() );
        copy.setNumber( copyDto.getNumber() );
        copy.setFormat( copyDto.getFormat() );
        copy.setLibrary( libraryDtoToLibrary( copyDto.getLibrary() ) );

        return copy;
    }

    protected List<Copy> copyDtoListToCopyList(List<CopyDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Copy> list1 = new ArrayList<Copy>( list.size() );
        for ( CopyDto copyDto : list ) {
            list1.add( copyDtoToCopy( copyDto ) );
        }

        return list1;
    }

    protected Author authorDtoToAuthor(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDto.getId() );
        author.setFirstName( authorDto.getFirstName() );
        author.setLastName( authorDto.getLastName() );

        return author;
    }

    protected Categorie categorieDtoToCategorie(CategorieDto categorieDto) {
        if ( categorieDto == null ) {
            return null;
        }

        Categorie categorie = new Categorie();

        categorie.setId( categorieDto.getId() );
        categorie.setLabel( categorieDto.getLabel() );

        return categorie;
    }
}
