package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello from MyController.sayHello()");
        return "Hello from return value of MyController.sayHello()";
    }
}
