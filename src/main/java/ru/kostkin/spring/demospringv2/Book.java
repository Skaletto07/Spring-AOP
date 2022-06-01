package ru.kostkin.spring.demospringv2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Some book")
    private String name;

    public String getName() {
        return name;
    }
}
