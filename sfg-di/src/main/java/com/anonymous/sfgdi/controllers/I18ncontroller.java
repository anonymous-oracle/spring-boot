package com.anonymous.sfgdi.controllers;

import com.anonymous.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18ncontroller {
    private final GreetingService greetingService;


    public I18ncontroller(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.sayGreeting();
    }
}
