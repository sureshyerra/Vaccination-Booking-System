package com.example.dosify.Dto.ResponseDto;

import com.example.dosify.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@FieldDefaults(level = AccessLevel.PRIVATE)
public class CenterResponseDto {

    String name;

    String location;

    CenterType centerType;
}
