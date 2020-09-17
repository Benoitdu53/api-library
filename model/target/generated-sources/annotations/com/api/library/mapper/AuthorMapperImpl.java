package com.api.library.mapper;

import com.api.library.dto.AuthorDto;
import com.api.library.model.Author;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-17T11:46:47+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDto authorToAuthorDto(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( author.getId() );
        authorDto.setFirstName( author.getFirstName() );
        authorDto.setLastName( author.getLastName() );

        return authorDto;
    }

    @Override
    public Author authorDtoToAuthor(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDto.getId() );
        author.setFirstName( authorDto.getFirstName() );
        author.setLastName( authorDto.getLastName() );

        return author;
    }
}
