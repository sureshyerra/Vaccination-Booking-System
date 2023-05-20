package com.example.dosify.Service.impl;

import com.example.dosify.Dto.RequestDto.DoctorRequestDto;
import com.example.dosify.Dto.ResponseDto.DoctorResponseDto;
import com.example.dosify.Exception.CenterNotPresentException;
import com.example.dosify.Model.Doctor;
import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.Repository.VaccinationCenterRepository;
import com.example.dosify.Service.DoctorService;
import com.example.dosify.Transformer.DoctorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;
    @Override
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException {

       Optional<VaccinationCenter> optionalVaccinationCenter =  vaccinationCenterRepository.findById(doctorRequestDto.getCenterId());

       if(!optionalVaccinationCenter.isPresent()) {
           throw new CenterNotPresentException("Invalid center id");

       }
       VaccinationCenter center = optionalVaccinationCenter.get();

       //Dto to entity
        Doctor doctor = DoctorTransformer.DoctorRequestDtoToDoctor(doctorRequestDto);
        doctor.setVaccinationcenter(center);

        center.getDoctors().add(doctor);

        VaccinationCenter savedCenter = vaccinationCenterRepository.save(center);

        return DoctorTransformer.DoctorToDoctorResponseDto(doctor);

    }
}
