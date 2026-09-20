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
        body.put("message", "Deployed by GitLab CI");
        return body;
    }
}
