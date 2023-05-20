package com.example.dosify.Service.impl;

import com.example.dosify.Dto.RequestDto.CenterRequestDto;
import com.example.dosify.Dto.ResponseDto.CenterResponseDto;
import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.Repository.VaccinationCenterRepository;
import com.example.dosify.Service.VaccinationCenterService;
import com.example.dosify.Transformer.VaccinationCenterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService {

    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;
    @Override
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {

        //convert to entity
        VaccinationCenter vaccinationCenter = VaccinationCenterTransformer.CenterRequestDtoToVaccinationCenter(centerRequestDto);

        VaccinationCenter savedvaccinationCenter = vaccinationCenterRepository.save(vaccinationCenter);

        CenterResponseDto centerResponseDto = VaccinationCenterTransformer.VaccinationCenterToCenterResponseDto(savedvaccinationCenter);

        return centerResponseDto;
    }
}
