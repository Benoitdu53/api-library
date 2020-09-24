package com.api.library.service.impl;

import com.api.library.dto.CopyDto;
import com.api.library.dto.CustomerDto;
import com.api.library.dto.EmpruntDto;
import com.api.library.mapper.CopyMapper;
import com.api.library.mapper.CustomerMapper;
import com.api.library.mapper.EmpruntMapper;
import com.api.library.model.Emprunt;
import com.api.library.repository.CopyRepository;
import com.api.library.repository.CustomerRepository;
import com.api.library.repository.EmpruntRepository;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class EmpruntServiceImpl implements EmpruntService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntRepository empruntRepository;

    @Autowired
    private CopyRepository copyRepository;

    @Autowired
    private CustomerRepository customerRepository;

    // -----------------------------------------------------  //

    /**
     * Récupère les prêts de l'utilisateur selon son id
     * @param id
     * @return
     */
    @Override
    public List<EmpruntDto> getEmpruntByIdCustomer(final Long id) {

        List<Emprunt> emprunts = empruntRepository.getEmpruntByIdCustomer(id);

        return EmpruntMapper.INSTANCE.map(emprunts);
    }

    @Override
    public void updateEmprunt(final Long id) {

    }

    @Override
    public EmpruntDto addEmprunt(String format, String nameLibrary, CustomerDto customerDto) {

        EmpruntDto empruntDto = new EmpruntDto();

        // Récupère une copy selon le format et la library
        CopyDto copyDto = CopyMapper.INSTANCE.copyToCopyDto(copyRepository.findFirstByFormatAndAndLibrary_Nom(format, nameLibrary));

        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 28);
        Date dateReturn = calendar.getTime();

        empruntDto.setCopy(copyDto);
        empruntDto.setCustomer(customerDto);
        empruntDto.setEmpruntDate(date);
        empruntDto.setExtended(false);
        empruntDto.setReturnDate(dateReturn);

        copyRepository.updateStatusUnavailable(copyDto.getId());

        empruntRepository.save(EmpruntMapper.INSTANCE.empruntDtoToEmprunt(empruntDto));

        return empruntDto;
    }

    @Override
    public void deleteEmprunt(final Long id) {

    }
}
