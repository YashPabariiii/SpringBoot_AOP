package com.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Loggingaspect {
    @Before("execution(* com.AOP.ShoppingCart.checkout())")
    public void beforelogger(){
        System.out.println("BeforeLogger Aspect  is called");
    }

    @After("execution(void com.AOP.ShoppingCart.checkout())")
//    @After("execution(return type package.Class.checkout())")
    public void afterLogger(){
        System.out.println("AfterLogger Aspect  is called");
    }
}