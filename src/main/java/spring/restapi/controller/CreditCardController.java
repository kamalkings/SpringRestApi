package spring.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.restapi.pojo.CreditCard;
import spring.restapi.service.CreditCardService;

import java.util.List;

@RestController
public class CreditCardController {
    @Autowired
 CreditCardService creditCardService;
    @GetMapping("getCreditCard")
    public String getCreditCardDetails(){
        return "Credit Card Details";
    }

    @GetMapping("/getCreditCards")
    public List<CreditCard> getallCreditCardDetails(){
        return creditCardService.getallcards();
    }

    @GetMapping("/getCreditCards/{bankName}")
    public CreditCard getByBank(@PathVariable String bankName){
        return creditCardService.getByBank(bankName);
    }

    @DeleteMapping ("/removeCreditCards/{bankName}")
    public void removeByBank(@PathVariable String bankName){
         creditCardService.removeby(bankName);
    }
}
