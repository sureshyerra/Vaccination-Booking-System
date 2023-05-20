package com.example.dosify.Controller;

import com.example.dosify.Dto.RequestDto.DoctorRequestDto;
import com.example.dosify.Dto.ResponseDto.DoctorResponseDto;
import com.example.dosify.Exception.CenterNotPresentException;
import com.example.dosify.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor") //common end point
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("/add")

    public ResponseEntity addDoctor(@RequestBody DoctorRequestDto doctorRequestDto){

        try{
            DoctorResponseDto doctorResponseDto = doctorService.addDoctor(doctorRequestDto);
            return new ResponseEntity(doctorResponseDto,HttpStatus.CREATED);
        } catch (CenterNotPresentException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
