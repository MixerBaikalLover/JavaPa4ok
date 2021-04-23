package ru.Mixer.ErrorHandling;

import java.io.*;
import java.util.Scanner;

public class BookReadException extends Exception{
    public static int pudge() throws IOException {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        System.out.println("Enter lib address then lib id");
        String address = scan.nextLine();
        int id = Integer.parseInt(scan.nextLine());
        Library lib = new Library("Nevazhno", 1);
        String name = Integer.toString(lib.getId()) + "_lib.txt";
        File file = new File(name);
        file.createNewFile();
        InputStream is;
        OutputStream os;
        Reader r;
        Writer w;
        InputStreamReader isr;
        OutputStreamWriter osw;
        System.out.println("Введите количество книг для добавления");
        int count = scan.nextInt();
        for (int i = 0;i<count ;i++){
            try {
                lib.readBook();
            } catch (BookReadException e) {
                System.out.println("Эммм не вводи чего не сказали");
                e.printStackTrace();
            }
        }
        FileUtils.write(file, lib);
        k = count - lib.getBooks().size();
        return k;
    }
    public BookReadException() {
    }

    public BookReadException(String message) {
        super(message);
    }

    public BookReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookReadException(Throwable cause) {
        super(cause);
    }

    public BookReadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
