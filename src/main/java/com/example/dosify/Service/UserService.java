package com.example.dosify.Service;

import com.example.dosify.Dto.RequestDto.UserRequestDto;
import com.example.dosify.Dto.ResponseDto.UserResponseDto;
import com.example.dosify.Model.User;

public interface UserService {

    public UserResponseDto addUser(UserRequestDto userRequestDto); // reusable
}
