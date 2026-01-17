package com.lottery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * System Controller
 */
@RestController
@RequestMapping("/api/system")
public class SystemController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "UP");
        result.put("service", "lottery-backend");
        result.put("version", "1.0.0");
        return result;
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "Lottery Platform Backend");
        info.put("description", "Open source lottery platform for learning");
        info.put("jdk", "17");
        info.put("springboot", "3.x");
        return info;
    }
}
