package spring.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.restapi.pojo.CreditCard;

@RestController
public class HelloApiController {

   // CreditCard creditCard;

    @GetMapping("/helloAPi")
    public String hello() {
        return "Spring Rest API Controller Class";
    }

    @RequestMapping(path ="/helloAPi2")
    public String helloword() {
        return "Spring Rest API RequestMapping Class";
    }

    @RequestMapping(path ="/returnBean")
    public CreditCard returnBean() {
        return new CreditCard("Kamalraj",8507,null);
    }

    @RequestMapping(path ="/returnBeanss/kamal/{name}")
    public CreditCard returnBeandynamic(@PathVariable String name) {
        return new CreditCard(name,8507,null);
    }
}

