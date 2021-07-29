package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.PropertyGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    /**
     * @Qualifier lets Spring know which instance that implements GreetingService Interface to inject.
     * Here, we can see that GreetingService is implemented by > 1 class. So which one to inject? In this case, we need PropertyGreetingServiceImpl.
     *  note: for @Qualifier the value needs to start with lowercase letter.
     *
     * @Autowired lets Spring know that it needs to perform property injection on the attribute marked with it.
     * Looks in the context and assigns it with the associated object from app context.
     */
    @Qualifier(value = "propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String greet(){
        return greetingService.getGreeting();
    }
}
