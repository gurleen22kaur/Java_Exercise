package com.bootcamp.aop;


import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;

@Aspect
public class LoggingAspect {

    //Question1
    @Before("execution(public void display())")
    public void log() {
        System.out.println("Before advice running");
    }

    @After("execution(public void display())")
    public void log2() {
        System.out.println("After advice running");
    }

    //Question 5
    /*@Pointcut("execution(public void display())")
    void displayPointCut()
    {}


    @After("displayPointCut()")
    public void runningAfterDisplayPointCut(){
        System.out.println("running After Display PointCut");
    }*/




    //Question 2
   /* @Before("execution(public void display())")
    void beforeAdvice()
    {
        System.out.println("Running before method");
    }

    @After("execution(public void display())")
    void afterAdvice()
    {
        System.out.println("Running after method");
    }*/


   //Question3
    /*@AfterThrowing(pointcut = "execution(void throwException())",throwing = "ex")
    void afterReturningAdvice(IOException ex) {
        System.out.println("Running AfterThrowing " + ex);
    }*/


    @Before("args(Integer)")
    void beforeAdvice() {
        System.out.println("Running before advice args");
    }

    //Question6

    @Before("execution(Integer getInteger(Integer))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
       Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
   }



}
