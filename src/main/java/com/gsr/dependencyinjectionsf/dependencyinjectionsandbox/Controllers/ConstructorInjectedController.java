package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.ConstructorGreetingServiceImpl;
import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    /***
     * @Qualifier lets Spring know which instance that implements GreetingService Interface to inject.
     * Here, we can see that GreetingService is implemented by > 1 class. So which one to inject? In this case, we need ConstructorGreetingServiceImpl.
     *   note: for @Qualifier the value needs to start with lowercase letter.
     * @Autowired annotation is optional as it is inferred that it is required by the framework itself.
     */
    public ConstructorInjectedController(@Qualifier(value = "constructorGreetingServiceImpl") GreetingService service) {
        this.greetingService = service;
    }

    public String greet(){
        return greetingService.getGreeting();
    }
}
