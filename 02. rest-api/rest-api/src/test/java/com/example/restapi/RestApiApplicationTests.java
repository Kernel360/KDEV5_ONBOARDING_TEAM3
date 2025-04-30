package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoads() throws JsonProcessingException {
        var user = new UserRequest("신짱구", 5, "jjang@naver.com", true);
        System.out.println(user);
//        user.setUserName("신짱구");
//        user.setUserAge(5);
//        user.setEmail("jjang@naver.com");
//        user.setIsKorean(true);

        var json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        var dto = objectMapper.readValue(json, UserRequest.class);
        System.out.println(dto);
    }

}
