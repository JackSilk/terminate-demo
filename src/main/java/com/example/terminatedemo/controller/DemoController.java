package com.example.terminatedemo.controller;

import com.example.terminatedemo.service.ShutdownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    ShutdownService shutdownService;

    /**
     * Shuts the application down
     */
    @PostMapping("/shutdown")
    public void shutdown() {
        shutdownService.shutdown();
    }
}
