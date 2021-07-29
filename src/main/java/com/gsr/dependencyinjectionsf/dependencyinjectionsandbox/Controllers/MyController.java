package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    /**
     * Follows the best practice of using Constructor injection.
     * @Qualifier not used because the required service is marked with @Primary (PrimaryConstructorGreetingServiceImpl).
     *
     * @Autowired is optional as it is already assumed by the framework.
     */
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.getGreeting();
    }
}
