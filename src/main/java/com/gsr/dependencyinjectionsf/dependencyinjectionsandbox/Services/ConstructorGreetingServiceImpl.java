package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting() {
        System.out.println("Hello! from ConstructorGreetingServiceImpl");
        return "Hello from ConstructorGreetingServiceImpl returned.";
    }
}
