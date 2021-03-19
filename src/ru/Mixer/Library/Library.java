package ru.Mixer.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private String title;
    private String address;
    private List<Book> books = new ArrayList<>();
    private Map<String, Integer> booksCache = new HashMap<>();

    public Library(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public boolean hasBook(String title){
        return booksCache.containsKey(title);
    }
    public Book takeBook(String title){
        for (int i = books.size() -1; i>0; i--){
            if (books.get(i).getTitle().equals(title)){
                Book cache = books.get(i);
                books.remove(i);
                if (booksCache.get(title) == 1){
                    booksCache.remove(title);
                } else booksCache.replace(title, booksCache.get(title) - 1);
                return cache;
            }
        }
     return null;
    }
    
    public void addBook(Book book){
        if(book != null){
            books.add(book);
            if(!booksCache.containsKey(book.getTitle())) booksCache.put(book.getTitle(),0);
            if(booksCache.containsKey(book.getTitle())){
                booksCache.replace(book.getTitle(),booksCache.get(book.getTitle())+1);
            }
        }
    }
    public int bookCount(String title){

        if (booksCache.get(title) != null)return booksCache.get(title);
        return 0;
    }

}
