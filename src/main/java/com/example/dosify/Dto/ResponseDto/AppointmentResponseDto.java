package com.example.dosify.Dto.ResponseDto;

import com.example.dosify.Enum.DoseNo;
import com.example.dosify.Enum.VaccineType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentResponseDto {

    String userName;

    String appointmentNo;

    Date dateOfAppointment;

    DoseNo doseNo;

    CenterResponseDto centerResponseDto;

    String doctorName;

    VaccineType vaccineType;
}
