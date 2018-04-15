package spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld()
    {
        return "Hello world! ;) Pipeline is working!";
    }
    @RequestMapping("/test")
    public String test()
    {
        return "Testing mapping!";
    }
}
