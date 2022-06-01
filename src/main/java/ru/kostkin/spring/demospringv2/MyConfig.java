package ru.kostkin.spring.demospringv2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.kostkin.spring.demospringv2")
@EnableAspectJAutoProxy
public class MyConfig {
}
