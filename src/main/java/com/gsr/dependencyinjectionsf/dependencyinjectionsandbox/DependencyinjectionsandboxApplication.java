package com.gsr.dependencyinjectionsf.dependencyinjectionsandbox;

import com.gsr.dependencyinjectionsf.dependencyinjectionsandbox.Controllers.*;
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

		/**
		 * Demo of how Property injected object gets used.
		 */
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean(PropertyInjectedController.class);
		propertyInjectedController.greet();

		/**
		 * Demo of how Setter injected object gets used.
		 */
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean(SetterInjectedController.class);
		setterInjectedController.greet();

		/**
		 * Demo of how profiling can be used to customize the runtime context of Spring apps.
		 */
		I18nController i18nController = (I18nController) context.getBean(I18nController.class);
		i18nController.greet();

	}

}
