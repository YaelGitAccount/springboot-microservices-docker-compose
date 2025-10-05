package com.example.greeting_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private final RestTemplate restTemplate = new RestTemplate();

    // אפשרות להגדרת כתובת של user-service דרך properties
    @Value("${user.service.url:http://user-service:8081}")
    private String userServiceUrl;

    @GetMapping("/{userId}")
    public String greetUser(@PathVariable int userId) {
        String url = userServiceUrl + "/users/" + userId;
        Map<?, ?> userResponse = restTemplate.getForObject(url, Map.class);
        String name = (String) userResponse.get("name");
        return "Hello " + name + "!";
    }
}
