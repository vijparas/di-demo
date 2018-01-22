package in.paras.controllers;

import in.paras.controller.SetterInjectedController;
import in.paras.services.GreetingServiceImpl;
import in.paras.services.GreetingsService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setup(){
        this.setterInjectedController=new SetterInjectedController();
        this.setterInjectedController.setGreetingsService(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,this.setterInjectedController.sayHello());
    }
}
