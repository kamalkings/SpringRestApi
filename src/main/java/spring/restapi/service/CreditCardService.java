package spring.restapi.service;

import org.springframework.stereotype.Component;
import spring.restapi.pojo.CreditCard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class CreditCardService {

  private static   List <CreditCard> creditCardList = new ArrayList<>() ;
  //List<CreditCard> creditCardList = new ArrayList<>();

static{
  creditCardList.add(new CreditCard("HDFC",8507,LocalDate.of(2026,9,01)));
  creditCardList.add(new CreditCard("SBI",1089,LocalDate.of(2027,9,01)));
  creditCardList.add(new CreditCard("KTK",7646,LocalDate.of(2028,9,01)));
  creditCardList.add(new CreditCard("KTK",1234,LocalDate.of(2028,9,01)));
}

public List<CreditCard>getallcards(){
  return creditCardList;
}


  public CreditCard getByBank(String name) {
    Predicate<? super CreditCard> predicate = creditcard -> creditcard.getName().equals(name);
    return creditCardList.stream().filter(predicate).findFirst().orElse(null);
  }
}
