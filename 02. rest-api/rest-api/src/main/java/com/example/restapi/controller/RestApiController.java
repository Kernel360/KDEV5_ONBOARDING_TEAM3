package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import com.example.restapi.model.MathMulParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello() {
        var html = "<html><body><h1> Hello Spring Boot </h1></body></html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}")
    public String echo(
            @PathVariable String message
    ) {
        System.out.println("echo messge: " + message);

        // Todo 대문자로 변환해서 RETURN
//        message = message.toUpperCase();
        return message.toUpperCase();
    }

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam String isseued_day

            //
    ) {
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(isseued_day);
    }

    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ) {
        System.out.println(bookQueryParam);
    }

    // TODO Parameter 2가지 받기. int 형태로 받아서 두 수의 덧셈, 곱셈
    // TODO String타입 boolean 타입도 받아보기

    @GetMapping(path = "/math/sum")
    public int sum(
            @RequestParam int num1,
            @RequestParam int num2
    ) {
        return num1 + num2;
    }

    @GetMapping(path = "/math/mul")
    public int mul(MathMulParam mathMulParam) {
        return mathMulParam.getNum1() * mathMulParam.getNum2();
    }

    @GetMapping(path = "/boolean")
    public boolean bol(@RequestParam boolean isTrue) {
        return isTrue;
    }

    @DeleteMapping(path = {"/user/{userName}/delete", "/user/{userName}/del"})
    public void delete(
            @PathVariable String userName
    ) {
        log.info("user-name: {}", userName);
    }
}
