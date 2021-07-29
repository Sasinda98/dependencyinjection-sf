package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("I18Service")
public class I18nGermanGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
        System.out.println("Hallo! - German Greeting Service.");
        return "Hallo! - German Greeting Service.";
    }
}
