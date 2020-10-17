package by.barzov.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "/first/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "/first/goodbye";
    }
}
