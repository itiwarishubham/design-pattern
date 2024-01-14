package com.design.pattern.strategy;

public class PaypalPayment implements PaymentStrategy{

    private String email;

    public PaypalPayment(String email){
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount + " by using PayPal with email "+ this.email);
    }
}
