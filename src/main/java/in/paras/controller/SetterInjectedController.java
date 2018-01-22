package in.paras.controller;
import in.paras.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingsService;

    @Autowired
    public void setGreetingsService(GreetingService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return this.greetingsService.sayGreeting();
    }
}