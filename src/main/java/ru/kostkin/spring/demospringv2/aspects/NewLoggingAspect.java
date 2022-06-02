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
        System.out.println("BEFORE");

        long begin = System.currentTimeMillis();
        Object o = joinPoint.proceed();
        long end = System.currentTimeMillis();

        log.debug("aroundReturnBookLoggingAdvice: book returned to the library");
        System.out.println("AFTER");
        System.out.println(end-begin);
        return o;
    }
}
