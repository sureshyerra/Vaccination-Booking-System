package com.example.dosify.Dto.RequestDto;

import com.example.dosify.Enum.CenterType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CenterRequestDto {

    String name;

    String location;


    CenterType centerType;
}
