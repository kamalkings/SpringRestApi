package spring.restapi.pojo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class CreditCard {
    private String name;
    private int cardNumber;
    private LocalDate expiryDate;

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", cardNumber=" + cardNumber +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CreditCard(String name, int cardNumber, LocalDate expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

}
