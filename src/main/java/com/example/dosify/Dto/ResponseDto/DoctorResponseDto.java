package com.example.dosify.Dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@FieldDefaults(level = AccessLevel.PRIVATE)

public class DoctorResponseDto {

    String name;

    String emailId;

    String mobNo;

    CenterResponseDto centerResponseDto;
}
