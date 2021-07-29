package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingService getGreetingService() {
        return greetingService;
    }
    /**
     * @Autowired lets Spring know that it needs to perform setter injection on the method marked with it.
     * Looks in the context and injects it with the associated object from app context.
     */
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

}
