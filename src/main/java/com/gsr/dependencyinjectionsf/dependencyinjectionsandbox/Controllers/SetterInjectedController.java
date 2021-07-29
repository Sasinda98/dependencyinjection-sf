package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    public GreetingService getGreetingService() {
        return greetingService;
    }
    /**
     * @Qualifier lets Spring know which instance that implements GreetingService Interface to inject.
     * Here, we can see that GreetingService is implemented by > 1 class. So which one to inject? In this case, we need PropertyGreetingServiceImpl.
     *  note: for @Qualifier the value needs to start with lowercase letter.
     *
     * @Autowired lets Spring know that it needs to perform setter injection on the method marked with it.
     * Looks in the context and injects it with the associated object from app context.
     */
    @Qualifier(value = "setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public String greet(){
        return greetingService.getGreeting();
    }

}
