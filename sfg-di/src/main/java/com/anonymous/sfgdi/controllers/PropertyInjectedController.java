package com.anonymous.sfgdi.controllers;

import com.anonymous.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }
}
