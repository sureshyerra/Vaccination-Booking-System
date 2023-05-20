package com.example.dosify.Service.impl;

import com.example.dosify.Dto.RequestDto.UserRequestDto;
import com.example.dosify.Dto.ResponseDto.UserResponseDto;
import com.example.dosify.Model.User;
import com.example.dosify.Repository.UserRepository;
import com.example.dosify.Service.UserService;
import com.example.dosify.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto) {

//       User user = new User();
//
//       user.setAge(userRequestDto.getAge());
//       user.setName(userRequestDto.getName());
//       user.setEmailId(userRequestDto.getEmailId());
//       user.setGender(userRequestDto.getGender());
//       user.setMobNo(userRequestDto.getMobNo());
//        User user = User.builder()
//                .age(userRequestDto.getAge())
//                .name(userRequestDto.getName())
//                .emailId(userRequestDto.getEmailId())
//                .mobNo(userRequestDto.getMobNo())
//                .gender(userRequestDto.getGender())
//                .build();
        User user = UserTransformer.UserRequestDtoToUser(userRequestDto);

       User savedUser = userRepository.save(user);

//       UserResponseDto userResponseDto = new UserResponseDto();
//
//       userResponseDto.setName(savedUser.getName());
//       userResponseDto.setMessage("user is added succesfully");
//        UserResponseDto userResponseDto = UserResponseDto.builder()
//                .message("user is added succesfully")
//                .name(savedUser.getName())
//                .build();
        UserResponseDto userResponseDto = UserTransformer.UserToUserResponseDto(savedUser);

        return userResponseDto;
    }
}
