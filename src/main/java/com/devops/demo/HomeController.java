package com.devops.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Value("${app.environment:unknown}")
    private String environment;

    @Value("${app.version:unknown}")
    private String version;

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> body = new LinkedHashMap<>();
        body.put("application", "gitlab-full-automation");
        body.put("environment", environment);
        body.put("version", version);
<<<<<<< HEAD
        body.put("message", "Hotfix applied");
=======
        body.put("message", "Hello from the feature branch");
>>>>>>> release/1.0
        return body;
    }
}
