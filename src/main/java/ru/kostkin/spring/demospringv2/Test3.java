package ru.kostkin.spring.demospringv2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static ru.kostkin.spring.demospringv2.aspects.LoggingAspect.log;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library lib = context.getBean("libraryBean", Library.class);

        String bookName = lib.returnBook();

        System.out.println("Book returned to the library: " + bookName);


        context.close();
        System.out.println("main ends");
    }
}
