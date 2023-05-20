package com.example.dosify.Dto.RequestDto;

import com.example.dosify.Enum.DoseNo;
import com.example.dosify.Enum.VaccineType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentRequestDto {

    DoseNo doseNo;

    int userId;

    int doctorId;

    VaccineType vaccineType;
}
