package in.paras.controller;

import in.paras.services.GreetingsService;

public class ConstructorInjectedController {

    private GreetingsService greetingService;

    public ConstructorInjectedController(GreetingsService greetingService){
        this.greetingService=greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
