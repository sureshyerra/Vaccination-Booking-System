package com.example.dosify.Transformer;

import com.example.dosify.Dto.RequestDto.DoctorRequestDto;
import com.example.dosify.Dto.ResponseDto.CenterResponseDto;
import com.example.dosify.Dto.ResponseDto.DoctorResponseDto;
import com.example.dosify.Model.Doctor;

public class DoctorTransformer {


    public static Doctor DoctorRequestDtoToDoctor(DoctorRequestDto doctorRequestDto){

        Doctor doctor = Doctor.builder()
                .name(doctorRequestDto.getName())
                .age(doctorRequestDto.getAge())
                .mobNo(doctorRequestDto.getMobNo())
                .gender(doctorRequestDto.getGender())
                .build();
        return doctor;
    }

    public static DoctorResponseDto DoctorToDoctorResponseDto(Doctor doctor) {

        CenterResponseDto centerResponseDto = VaccinationCenterTransformer.VaccinationCenterToCenterResponseDto(doctor.getVaccinationcenter());

        DoctorResponseDto doctorResponseDto = DoctorResponseDto.builder()
                .emailId(doctor.getEmailId())
                .name(doctor.getName())
                .mobNo(doctor.getMobNo())
                .centerResponseDto(centerResponseDto).build();
        return doctorResponseDto;
    }
}
