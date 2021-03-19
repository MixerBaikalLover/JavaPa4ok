package ru.Mixer.Library;

import java.util.List;

public class Main {
    public static void main(String[] args){
    Library lib = new Library("Pudj","Padj");
    Book buk = new Book("Butchery", "Pudge", 191);
    lib.addBook(buk);
        System.out.println(lib.bookCount("Butchery"));
        System.out.println(lib.hasBook("Butchery"));
        System.out.println(lib.hasBook("Butchey"));
    lib.addBook(buk);
        System.out.println(lib.hasBook("Butchery"));
        System.out.println(lib.hasBook("Butchey"));
        System.out.println(lib.takeBook("Butchery"));
        System.out.println(lib.bookCount("Butchery"));
    }
}
