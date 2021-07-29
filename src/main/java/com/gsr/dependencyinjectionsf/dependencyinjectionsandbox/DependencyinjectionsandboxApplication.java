package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers.ConstructorInjectedController;
import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionsandboxApplication {

	public static void main(String[] args) {
		/**
		 * Shows how to get reference to objects within the application context.
		 */
		ApplicationContext context = SpringApplication.run(DependencyinjectionsandboxApplication.class, args);
		MyController controller = (MyController) context.getBean(MyController.class);
		System.out.println(controller.sayHello());


		/**
		 * Demo of how Constructor injected object gets used.
		 */
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean(ConstructorInjectedController.class);
		constructorInjectedController.greet();
	}

}
