package com.api.library.mapper;

import com.api.library.dto.BookDto;
import com.api.library.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);
    List<BookDto> map(List<Book> books);
    Book bookDtoToBook(BookDto bookDto);

}
