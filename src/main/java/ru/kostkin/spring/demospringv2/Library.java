package ru.kostkin.spring.demospringv2;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("We get book");
//        System.out.println("Мы берем книгу");
    }
    public String returnBook() {
        System.out.println("We return book to lib from lib");
        return "ok";
    }
    public void getMagazine() {
        System.out.println("We get magazine from lib");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to lib");
    }

    public void addMagazine() {
        System.out.println("We add magazine to lib");
    }

    public void addBook() {
        System.out.println("We add book to lib");
    }

}
