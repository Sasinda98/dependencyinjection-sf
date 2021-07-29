package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("I18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.getGreeting();
    }
}
