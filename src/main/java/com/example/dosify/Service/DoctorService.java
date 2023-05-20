package com.example.dosify.Service;

import com.example.dosify.Dto.RequestDto.DoctorRequestDto;
import com.example.dosify.Dto.ResponseDto.DoctorResponseDto;
import com.example.dosify.Exception.CenterNotPresentException;

public interface DoctorService {

    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException;
}
