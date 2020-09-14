package com.api.library.mapper;

import com.api.library.dto.CopyDto;
import com.api.library.model.Copy;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CopyMapper {

    CopyMapper INSTANCE = Mappers.getMapper(CopyMapper.class);
    CopyDto copyToCopyDto( Copy copy);
}
