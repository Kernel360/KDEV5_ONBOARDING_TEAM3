package com.example.restapi.controller;

import com.example.restapi.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseApiController {

//    @GetMapping("")
//    public ResponseEntity user() {
//        var user = new UserRequest();
//        user.setUserName("신짱구");
//        user.setUserAge(5);
//        user.setEmail("jjang@naver.com");
//
//        log.info("user: {}", user);
//
//        var response = ResponseEntity.status(HttpStatus.OK).body(user);
//        return response;
//    }
}
