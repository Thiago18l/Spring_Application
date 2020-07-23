package REST_service;

import org.springframework.boot.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

@RestController
@EnableAutoConfiguration
public class Home {
    @RequestMapping("/")
    String home () {
        return "Home page!";
    }
    @RequestMapping("/test")
    String test () {
        return "this is a test page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Home.class, args);
    }
}
