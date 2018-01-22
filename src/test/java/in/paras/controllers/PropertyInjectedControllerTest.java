package in.paras.controllers;

import in.paras.controller.PropertyInjectedController;
import in.paras.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setup(){
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceImpl();
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}
