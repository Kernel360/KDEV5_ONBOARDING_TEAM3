package com.example.restapi.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/book")
    public void queryParamDto(
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
}
