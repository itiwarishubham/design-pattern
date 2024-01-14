package com.design.pattern;

import com.design.pattern.strategy.CreditCardPayment;
import com.design.pattern.strategy.PaypalPayment;
import com.design.pattern.strategy.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        shoppingCart();
    }

    public static void shoppingCart(){
        ShoppingCart cart = new ShoppingCart();

        PaypalPayment paypalPayment = new PaypalPayment("shubham@google.com");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(200);

        CreditCardPayment creditCardPayment = new CreditCardPayment("1234567890");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);
    }
}