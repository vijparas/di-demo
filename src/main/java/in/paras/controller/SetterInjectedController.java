package in.paras.controller;

import in.paras.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return this.greetingsService.sayGreeting();
    }
}
