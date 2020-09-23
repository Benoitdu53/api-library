package com.api.library.mapper;

import com.api.library.dto.CopyDto;
import com.api.library.dto.EmpruntDto;
import com.api.library.dto.LibraryDto;
import com.api.library.model.Copy;
import com.api.library.model.Emprunt;
import com.api.library.model.Library;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-23T14:40:57+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.6 (Ubuntu)"
)
public class EmpruntMapperImpl implements EmpruntMapper {

    @Override
    public List<EmpruntDto> map(List<Emprunt> emprunts) {
        if ( emprunts == null ) {
            return null;
        }

        List<EmpruntDto> list = new ArrayList<EmpruntDto>( emprunts.size() );
        for ( Emprunt emprunt : emprunts ) {
            list.add( empruntToEmpruntDto( emprunt ) );
        }

        return list;
    }

    @Override
    public EmpruntDto empruntToEmpruntDto(Emprunt emprunt) {
        if ( emprunt == null ) {
            return null;
        }

        EmpruntDto empruntDto = new EmpruntDto();

        empruntDto.setId( emprunt.getId() );
        empruntDto.setEmpruntDate( emprunt.getEmpruntDate() );
        empruntDto.setReturnDate( emprunt.getReturnDate() );
        empruntDto.setExtended( emprunt.getExtended() );
        empruntDto.setCopy( copyToCopyDto( emprunt.getCopy() ) );

        return empruntDto;
    }

    @Override
    public Emprunt empruntDtoToEmprunt(EmpruntDto empruntDto) {
        if ( empruntDto == null ) {
            return null;
        }

        Emprunt emprunt = new Emprunt();

        emprunt.setId( empruntDto.getId() );
        emprunt.setEmpruntDate( empruntDto.getEmpruntDate() );
        emprunt.setReturnDate( empruntDto.getReturnDate() );
        emprunt.setExtended( empruntDto.getExtended() );
        emprunt.setCopy( copyDtoToCopy( empruntDto.getCopy() ) );

        return emprunt;
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
        copyDto.setFormat( copy.getFormat() );
        copyDto.setStatus( copy.getStatus() );
        copyDto.setLibrary( libraryToLibraryDto( copy.getLibrary() ) );

        return copyDto;
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

        copy.setStatus( copyDto.getStatus() );
        copy.setId( copyDto.getId() );
        copy.setFormat( copyDto.getFormat() );
        copy.setLibrary( libraryDtoToLibrary( copyDto.getLibrary() ) );

        return copy;
    }
}
