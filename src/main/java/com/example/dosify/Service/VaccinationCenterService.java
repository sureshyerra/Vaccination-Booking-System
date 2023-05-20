package com.example.dosify.Service;

import com.example.dosify.Dto.RequestDto.CenterRequestDto;
import com.example.dosify.Dto.ResponseDto.CenterResponseDto;

public interface VaccinationCenterService {

    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto);
}
