package com.example.dosify.Dto.RequestDto;

import com.example.dosify.Enum.Gender;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {

    String name;

    int age;

    String emailId;

    String mobNo;

    Gender gender;
}
