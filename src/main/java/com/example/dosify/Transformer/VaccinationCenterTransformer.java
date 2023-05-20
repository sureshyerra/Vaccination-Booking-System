package com.example.dosify.Transformer;

import com.example.dosify.Dto.RequestDto.CenterRequestDto;
import com.example.dosify.Dto.ResponseDto.CenterResponseDto;
import com.example.dosify.Model.VaccinationCenter;

public class VaccinationCenterTransformer {

    public static VaccinationCenter CenterRequestDtoToVaccinationCenter(CenterRequestDto centerRequestDto){
        VaccinationCenter vaccinationCenter = VaccinationCenter.builder()
                .centerType(centerRequestDto.getCenterType())
                .name(centerRequestDto.getName())
                .location(centerRequestDto.getLocation())
                .build();
        return vaccinationCenter;
    }

    public static CenterResponseDto VaccinationCenterToCenterResponseDto(VaccinationCenter vaccinationCenter){
        CenterResponseDto centerResponseDto = CenterResponseDto.builder()
                .location(vaccinationCenter.getLocation())
                .name(vaccinationCenter.getName())
                .centerType(vaccinationCenter.getCenterType()).build();
        return centerResponseDto;
    }
}
