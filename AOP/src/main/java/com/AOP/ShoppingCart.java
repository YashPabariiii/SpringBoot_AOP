package com.AOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(){
        System.out.println("Checkout method from shopping cart is called");
    }
}
