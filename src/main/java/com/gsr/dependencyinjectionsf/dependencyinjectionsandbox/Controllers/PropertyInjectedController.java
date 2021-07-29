package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    /**
     * @Autowired lets Spring know that it needs to perform property injection on the attribute marked with it.
     * Looks in the context and assigns it with the associated object from app context.
     */
    @Autowired
    public GreetingService greetingService;

    public String greet(){
        return greetingService.getGreeting();
    }
}
