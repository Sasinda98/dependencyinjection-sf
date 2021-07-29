package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("I18Service")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        System.out.println("Hello! - English Greeting Service.");
        return  "Hello! - English Greeting Service.";
    }
}
