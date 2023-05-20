package com.example.dosify.Controller;


import com.example.dosify.Dto.RequestDto.UserRequestDto;
import com.example.dosify.Dto.ResponseDto.UserResponseDto;
import com.example.dosify.Model.User;
import com.example.dosify.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") //common end point
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")

    public ResponseEntity addUser(@RequestBody UserRequestDto userRequestDto){ // to send http statuscode
        UserResponseDto userResponseDto = userService.addUser(userRequestDto);

        return new ResponseEntity(userResponseDto, HttpStatus.CREATED);

    }

}
