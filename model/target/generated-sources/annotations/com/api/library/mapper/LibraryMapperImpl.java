package com.api.library.mapper;

import com.api.library.dto.LibraryDto;
import com.api.library.model.Library;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-20T17:06:29+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
public class LibraryMapperImpl implements LibraryMapper {

    @Override
    public LibraryDto libraryToLibraryDto(Library library) {
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
}
