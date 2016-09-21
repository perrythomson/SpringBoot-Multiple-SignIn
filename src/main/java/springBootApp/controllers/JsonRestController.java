package springBootApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class JsonRestController {


    @RequestMapping("/")
    public String index() {
        return "<h1>Greetings from Spring Boot!</h1>";
    }
}