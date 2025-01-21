package spring.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    @GetMapping("getCreditCard")
    public String getCreditCardDetails(){
        return "Credit Card Details";
    }
}
