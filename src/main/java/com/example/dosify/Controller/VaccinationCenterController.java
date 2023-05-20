package com.example.dosify.Controller;


import com.example.dosify.Dto.RequestDto.CenterRequestDto;
import com.example.dosify.Dto.ResponseDto.CenterResponseDto;
import com.example.dosify.Service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterService vaccinationCenterService;

    @PostMapping("/add")

    public ResponseEntity addCenter(@RequestBody CenterRequestDto centerRequestDto){
        CenterResponseDto centerResponseDto = vaccinationCenterService.addCenter(centerRequestDto);

        return new ResponseEntity(centerResponseDto, HttpStatus.CREATED);
    }
}
