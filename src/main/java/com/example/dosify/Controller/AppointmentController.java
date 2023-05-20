package com.example.dosify.Controller;

import com.example.dosify.Dto.RequestDto.AppointmentRequestDto;
import com.example.dosify.Dto.ResponseDto.AppointmentResponseDto;
import com.example.dosify.Exception.DoctorNotFoundException;
import com.example.dosify.Exception.NotEligibleForDoseException;
import com.example.dosify.Exception.UserNotFoundException;
import com.example.dosify.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownServiceException;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/book")
    public AppointmentResponseDto bookAppointment(@RequestBody AppointmentRequestDto appointmentRequestDto) throws UserNotFoundException, DoctorNotFoundException, UnknownServiceException, NotEligibleForDoseException, DoctorNotFoundException {

        return appointmentService.bookAppointment(appointmentRequestDto);
    }
}
