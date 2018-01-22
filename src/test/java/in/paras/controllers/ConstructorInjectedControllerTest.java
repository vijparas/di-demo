package in.paras.controllers;

import in.paras.controller.ConstructorInjectedController;
import in.paras.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup(){
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}
