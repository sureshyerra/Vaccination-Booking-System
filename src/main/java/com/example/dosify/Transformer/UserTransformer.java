package com.example.dosify.Transformer;

import com.example.dosify.Dto.RequestDto.UserRequestDto;
import com.example.dosify.Dto.ResponseDto.UserResponseDto;
import com.example.dosify.Model.User;

public class UserTransformer {


    public  static User UserRequestDtoToUser(UserRequestDto userRequestDto){
        User user = User.builder()
                .age(userRequestDto.getAge())
                .name(userRequestDto.getName())
                .emailId(userRequestDto.getEmailId())
                .mobNo(userRequestDto.getMobNo())
                .gender(userRequestDto.getGender())
                .build();
        return user;
    }

    public static UserResponseDto UserToUserResponseDto(User user){
        UserResponseDto userResponseDto = UserResponseDto.builder()
                .message("user is added succesfully")
                .name(user.getName())
                .build();
        return userResponseDto;
    }
}
