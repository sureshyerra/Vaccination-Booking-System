package com.example.dosify.Dto.ResponseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {

    String name;

    String message;
}
