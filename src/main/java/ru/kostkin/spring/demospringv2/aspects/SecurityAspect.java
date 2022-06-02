package ru.kostkin.spring.demospringv2.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static ru.kostkin.spring.demospringv2.aspects.LoggingAspect.log;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("ru.kostkin.spring.demospringv2.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        log.debug("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");

    }
}
