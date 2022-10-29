package com.anonymous.sfgdi;

import com.anonymous.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		I18ncontroller i18ncontroller = (I18ncontroller) ctx.getBean("i18ncontroller");
		System.out.println(i18ncontroller.sayHello());
//		String greeting = myController.sayHello();
//
//		System.out.println(greeting);

		System.out.println("Primary bean");
		System.out.println(myController.sayHello());

		System.out.println("Property injected controller");

		System.out.println(((PropertyInjectedController) ctx.getBean("propertyInjectedController")).getGreeting());

		System.out.println("Setter injected controller");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean(
				"setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor injected controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean(
				"constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
