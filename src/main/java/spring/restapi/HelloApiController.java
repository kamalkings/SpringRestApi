package spring.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    @GetMapping("/helloAPi")
    public String hello() {
        return "Spring Rest API Controller Class";
    }

    @RequestMapping(path ="/helloAPi2")
    public String helloword() {
        return "Spring Rest API RequestMapping Class";
    }

}

