package com.api.library.mapper;

import com.api.library.dto.EmpruntDto;
import com.api.library.model.Emprunt;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-22T11:44:00+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
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

        return emprunt;
    }
}
