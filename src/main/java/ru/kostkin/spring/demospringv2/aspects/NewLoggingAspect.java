package ru.kostkin.spring.demospringv2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import static ru.kostkin.spring.demospringv2.aspects.LoggingAspect.log;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Object o = null;
    try {
         o = joinPoint.proceed();
    } catch (Exception e) {
        log.debug("aroundReturnBookLoggingAdvice" + e);
        throw e;
    }


        log.debug("aroundReturnBookLoggingAdvice: book returned to the library");

        return o;
    }
}
