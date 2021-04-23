package ru.Mixer.ErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private int id;
    private String address;
    private List<Book> books = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Library(String address, int id) {
        this.id = id;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void readBook() throws BookReadException{
        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Введите ID книги(свитка)((бересты))(((папируса)))");
        int id = Integer.parseInt(scan.nextLine());
        if (id <= 0) throw new BookReadException("ID must be greater then zero");
        System.out.println("Введите название книги(свитка)((бересты))(((папируса)))");
        String title = scan.nextLine();
        if (title.length() <3 | title.length() > 30);
        System.out.println("Введите автора книги(свитка)((бересты))(((папируса)))");
        String author = scan.nextLine();
        if (author.length() <3 | author.length() > 30);
        System.out.println("Введите год создания книги(свитка)((бересты))(((папируса)))");
        int year = Integer.parseInt(scan.nextLine());
        book.setTitle(title);
        book.setId(id);
        book.setAuthor(author);
        book.setYear(year);
        books.add(book);
    }
}
