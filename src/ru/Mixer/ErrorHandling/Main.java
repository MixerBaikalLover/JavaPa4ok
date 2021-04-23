package ru.Mixer.ErrorHandling;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(BookReadException.pudge());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
