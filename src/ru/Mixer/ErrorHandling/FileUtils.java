package ru.Mixer.ErrorHandling;

import java.io.*;
import java.util.Arrays;

public class FileUtils {
    public static void write(File file, Library library) throws IOException {
        InputStream is;
        OutputStream os;
        Reader r;
        Writer w;
        InputStreamReader isr;
        OutputStreamWriter osw;
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
      //  String[] arr = new String[library.getBooks().size() + 1];
        for (int i = 0; i <= library.getBooks().size(); i++){
            if (i == 0) {
                bw.write(library.getId() + ";" + library.getAddress());
                bw.newLine();
                continue;
            }
            bw.write(library.getBooks().get(i-1).getId() + ";" + library.getBooks().get(i-1).getTitle()+ ";" + library.getBooks().get(i-1).getAuthor()+ ";" + library.getBooks().get(i-1).getYear());
        }
       // bw.write("asd");
        bw.flush();
        bw.close();
    }
    public static void read(File file) throws IOException {

    }
}
