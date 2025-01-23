package spring.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity removeByBank(@PathVariable String bankName){
         creditCardService.removeby(bankName);
        return new ResponseEntity<>("Credit card added Deleted!", HttpStatus.OK);
    }

    @PostMapping("/addCreditCards")
    public ResponseEntity addCreditCards(@RequestBody CreditCard CreditCard){
        creditCardService.addCreditCard(CreditCard);
      return new ResponseEntity<>("Credit card added successfully!", HttpStatus.CREATED);
    }

}
