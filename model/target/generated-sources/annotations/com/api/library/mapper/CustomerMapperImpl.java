package com.api.library.mapper;

import com.api.library.dto.CopyDto;
import com.api.library.dto.CustomerDto;
import com.api.library.dto.EmpruntDto;
import com.api.library.dto.LibraryDto;
import com.api.library.model.Copy;
import com.api.library.model.Customer;
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
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto userToUserDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId( customer.getId() );
        customerDto.setFirstName( customer.getFirstName() );
        customerDto.setLastName( customer.getLastName() );
        customerDto.setAdress( customer.getAdress() );
        customerDto.setPostalCode( customer.getPostalCode() );
        customerDto.setCity( customer.getCity() );
        customerDto.setEmail( customer.getEmail() );
        customerDto.setPassword( customer.getPassword() );
        customerDto.setEmpruntList( empruntListToEmpruntDtoList( customer.getEmpruntList() ) );

        return customerDto;
    }

    @Override
    public Customer userDtoToUser(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerDto.getId() );
        customer.setFirstName( customerDto.getFirstName() );
        customer.setLastName( customerDto.getLastName() );
        customer.setAdress( customerDto.getAdress() );
        customer.setPostalCode( customerDto.getPostalCode() );
        customer.setCity( customerDto.getCity() );
        customer.setEmail( customerDto.getEmail() );
        customer.setPassword( customerDto.getPassword() );
        customer.setEmpruntList( empruntDtoListToEmpruntList( customerDto.getEmpruntList() ) );

        return customer;
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

    protected EmpruntDto empruntToEmpruntDto(Emprunt emprunt) {
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

    protected List<EmpruntDto> empruntListToEmpruntDtoList(List<Emprunt> list) {
        if ( list == null ) {
            return null;
        }

        List<EmpruntDto> list1 = new ArrayList<EmpruntDto>( list.size() );
        for ( Emprunt emprunt : list ) {
            list1.add( empruntToEmpruntDto( emprunt ) );
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

        copy.setStatus( copyDto.getStatus() );
        copy.setId( copyDto.getId() );
        copy.setFormat( copyDto.getFormat() );
        copy.setLibrary( libraryDtoToLibrary( copyDto.getLibrary() ) );

        return copy;
    }

    protected Emprunt empruntDtoToEmprunt(EmpruntDto empruntDto) {
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

    protected List<Emprunt> empruntDtoListToEmpruntList(List<EmpruntDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Emprunt> list1 = new ArrayList<Emprunt>( list.size() );
        for ( EmpruntDto empruntDto : list ) {
            list1.add( empruntDtoToEmprunt( empruntDto ) );
        }

        return list1;
    }
}
