package in.paras.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("Hello world");
        return "foo";
    }
}
