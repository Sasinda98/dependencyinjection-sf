package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * @Primary is used to tell Spring that if more than one class implements GreetingService and
 * there's a place in which injection of a class that implements this, is required,
 * then @Primary lets the framework know that if @Qualifier is not used for explicit specification,
 * go ahead and use one marked with @Primary as the default for injection.
 */
@Primary
@Service
public class PrimaryConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        System.out.println("Hello! from PrimaryConstructorGreetingServiceImpl");
        return "Hello from PrimaryConstructorGreetingServiceImpl returned.";
    }
}
