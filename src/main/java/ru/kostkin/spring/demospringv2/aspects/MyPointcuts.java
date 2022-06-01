package ru.kostkin.spring.demospringv2.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){
    }
}
