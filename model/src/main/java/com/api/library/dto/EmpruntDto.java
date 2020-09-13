package com.api.library.dto;

import com.api.library.model.Copy;
import com.api.library.model.User;

import java.util.Date;

public class EmpruntDto {

    private Long id;
    private Date empruntDate;
    private Date returnDate;
    private Boolean isExtended;
    private CopyDto copyDto;
    private UserDto userDto;

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(final UserDto userDto) {
        this.userDto = userDto;
    }

    public CopyDto getCopyDto() {
        return copyDto;
    }

    public void setCopyDto(final CopyDto copyDto) {
        this.copyDto = copyDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getEmpruntDate() {
        return empruntDate;
    }

    public void setEmpruntDate(final Date empruntDate) {
        this.empruntDate = empruntDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(final Date returnDate) {
        this.returnDate = returnDate;
    }

    public Boolean getExtended() {
        return isExtended;
    }

    public void setExtended(final Boolean extended) {
        isExtended = extended;
    }
}
