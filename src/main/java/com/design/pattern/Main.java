package com.design.pattern;

import com.design.pattern.singleton.ConfigurationManager;
import com.design.pattern.strategy.CreditCardPayment;
import com.design.pattern.strategy.PaypalPayment;
import com.design.pattern.strategy.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        testStrategyPattern();
        testSingletonPattern();
    }

    public static void testStrategyPattern(){
        ShoppingCart cart = new ShoppingCart();

        PaypalPayment paypalPayment = new PaypalPayment("shubham@google.com");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(200);

        CreditCardPayment creditCardPayment = new CreditCardPayment("1234567890");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);
    }

    public static void testSingletonPattern(){
        ConfigurationManager configurationManager = ConfigurationManager.getConfigurationManager();
        ConfigurationManager configurationManager1 = ConfigurationManager.getConfigurationManager();
        System.out.println("Both Objects are same = "+(configurationManager == configurationManager1));
    }
}