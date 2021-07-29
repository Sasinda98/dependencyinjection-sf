package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        System.out.println("Hello! from PropertyGreetingServiceImpl");
        return "Hello from PropertyGreetingServiceImpl returned.";
    }
}
