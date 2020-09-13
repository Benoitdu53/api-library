package com.api.library.mapper;

import com.api.library.dto.BookDto;
import com.api.library.model.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-13T09:56:39+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Ubuntu)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setTitle( book.getTitle() );
        bookDto.setPubDate( book.getPubDate() );
        bookDto.setPage( book.getPage() );
        bookDto.setSynopsis( book.getSynopsis() );
        bookDto.setCover( book.getCover() );

        return bookDto;
    }

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
    public Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDto.getId() );
        book.setTitle( bookDto.getTitle() );
        book.setPubDate( bookDto.getPubDate() );
        book.setPage( bookDto.getPage() );
        book.setSynopsis( bookDto.getSynopsis() );
        book.setCover( bookDto.getCover() );

        return book;
    }
}
