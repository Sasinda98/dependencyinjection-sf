package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        System.out.println("Hello! from SetterGreetingServiceImpl");
        return "Hello from SetterGreetingServiceImpl returned.";
    }
}
