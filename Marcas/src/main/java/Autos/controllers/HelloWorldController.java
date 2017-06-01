package Autos.controllers;

/**
 * Created by alumno on 31/05/2017.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String sayHelloWorld() {
        return "Hello World in your SpringBoot Application!";
    }
}
