package com.example.terminatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * Shuts the application down
 */
@Service
public class ShutdownService {

    private final ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();

    @Autowired
    ApplicationContext applicationContext;

    public ShutdownService() {
        taskExecutor.initialize();
    }

    public void shutdown() {
        // invoke exit on a different thread so we can end our HTTP request
        taskExecutor.submit(() -> {
            int returnCode = SpringApplication.exit(applicationContext);
            System.exit(returnCode);
        });
    }
}
