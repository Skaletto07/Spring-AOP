package ru.kostkin.spring.demospringv2.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.kostkin.spring.demospringv2.Book;

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


    @Before("ru.kostkin.spring.demospringv2.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        log.debug("MethodSignature = " + signature);
        log.debug("MethodSignature.getMethod() = " + signature.getMethod());
        log.debug("MethodSignature.getReturnType() = " + signature.getReturnType());
        log.debug("MethodSignature.getName() = " + signature.getName());

        if (signature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book myBook = (Book) arg;
                    log.debug("about book: name - " + myBook.getName() + ", author - " + myBook.getAuthor() + ", year of publication - "
                            + myBook.getYearOfPublication());
                } else if (arg instanceof String) {
                    log.debug("add book to lib " + arg);
                }
            }
        }


        log.debug("beforeGetBookAdvice: logging to receive book or magazine!");
    }


}
