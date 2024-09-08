package com.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(com.AOP..*)")
public void authenticatingpointcut(){

}
@Pointcut("within(com.AOP..*)")
public void authorisationpointcut(){

}

@Before("authenticatingpointcut() && authorisationpointcut() ")
public void authenticate(){
    System.out.println("Authenticating the request");
}
}