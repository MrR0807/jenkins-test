package com.example.demo.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${application.endpoints.greetings}", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorld {

    @GetMapping
    public HelloResponse hello() {
        return new HelloResponse("Hi");
    }

    public static class HelloResponse {
        private final String response;

        @JsonCreator
        public HelloResponse(String response) {
            this.response = response;
        }

        public String getResponse() {
            return response;
        }
    }
}