package ru.kostkin.spring.demospringv2.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    public static Logger log = LogManager.getLogger(LoggingAspect.class);

    /*@Pointcut("execution(* ru.kostkin.spring.demospringv2.Library.*(..))")
    private void allMethodsFromLibrary() {
    }

    @Pointcut("execution(public void ru.kostkin.spring.demospringv2.Library.returnMagazine())")
    private void returnMagazineFromLibrary() {
    }

    @Pointcut("allMethodsFromLibrary() && !returnMagazineFromLibrary()")
    private void allMethodsExceptReturnMagazineFromLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        log.debug("beforeAllMethodsExceptReturnMagazineAdvice: writing log #10");
    }*/






    /*@Pointcut("execution(* ru.kostkin.spring.demospringv2.Library.get*())")
    private void allGetMethodFromLibrary(){
    }

    @Pointcut("execution(* ru.kostkin.spring.demospringv2.Library.return*())")
    private void allReturnMethodFromLibrary(){
    }

    @Pointcut("allGetMethodFromLibrary() || allReturnMethodFromLibrary()")
    private void allGetAndReturnMethodFromLibrary(){
    }

    @Before("allGetMethodFromLibrary()")
    public void beforeGetLoggingAdvice() {
    log.debug("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        log.debug("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetAndReturnMethodFromLibrary()")
    public void beforeGetAndReturnMethodFromLibrary() {
        log.debug("beforeGetAndReturnMethodFromLibrary: writing log #3");
    }
*/



    @Before("ru.kostkin.spring.demospringv2.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        log.debug("beforeGetBookAdvice: logging to receive book or magazine!");
    }


}
