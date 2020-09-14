package com.api.library.mapper;

import com.api.library.dto.CopyDto;
import com.api.library.dto.LibraryDto;
import com.api.library.model.Copy;
import com.api.library.model.Library;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-14T23:39:25+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Ubuntu)"
)
public class CopyMapperImpl implements CopyMapper {

    @Override
    public CopyDto copyToCopyDto(Copy copy) {
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
}
