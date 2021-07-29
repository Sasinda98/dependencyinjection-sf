package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting() {
        System.out.println("Hello!");
        return "Hello returned.";
    }
}
