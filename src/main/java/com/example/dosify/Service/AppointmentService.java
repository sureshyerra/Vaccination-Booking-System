package com.example.dosify.Service;

import com.example.dosify.Dto.RequestDto.AppointmentRequestDto;
import com.example.dosify.Dto.ResponseDto.AppointmentResponseDto;
import com.example.dosify.Exception.DoctorNotFoundException;
import com.example.dosify.Exception.NotEligibleForDoseException;
import com.example.dosify.Exception.UserNotFoundException;

import java.net.UnknownServiceException;

public interface AppointmentService {

    public AppointmentResponseDto bookAppointment(AppointmentRequestDto appointmentRequestDto) throws UnknownServiceException, UserNotFoundException, DoctorNotFoundException, NotEligibleForDoseException;
}
