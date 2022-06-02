package ru.kostkin.spring.demospringv2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library lib = context.getBean("libraryBean", Library.class);
        Book book = context.getBean("book", Book.class);
        lib.getBook();
//        lib.returnMagazine();
        lib.addBook("Mark",book);
        lib.addMagazine();
//        lib.getMagazine();


        context.close();


    }
}
