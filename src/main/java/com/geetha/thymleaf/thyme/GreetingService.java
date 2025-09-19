package com.geetha.thymleaf.thyme;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String generateMessage(String name) {
        return "Hello " + name + ", Welcome To KodNest!";
    }
}
