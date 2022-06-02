package ru.kostkin.spring.demospringv2;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("We get book");
        System.out.println("-------------------------------------------");
    }
    public String returnBook() {
        System.out.println("We return book to lib");
        return "war and peace";
    }
    public void getMagazine() {
        System.out.println("We get magazine from lib");
        System.out.println("-------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to lib");
        System.out.println("-------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine to lib");
        System.out.println("-------------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We add book to lib");
        System.out.println("-------------------------------------------");
    }

}
