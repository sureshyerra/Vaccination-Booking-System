package com.example.dosify.Dto.RequestDto;

import com.example.dosify.Enum.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorRequestDto {


    String name;

    int age;

    String emailId;

    String mobNo;

    Gender gender;

    int centerId;
}
