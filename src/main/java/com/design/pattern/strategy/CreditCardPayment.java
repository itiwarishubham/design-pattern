package com.design.pattern.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount + " by using Credit Card with card number "+ this.cardNumber);
    }
}
