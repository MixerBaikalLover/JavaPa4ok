package ru.Mixer.Lab3;

import java.io.*;
import java.nio.file.Path;

public class FileUtils {
    public static void saveConfig(File path, GameConfig config) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("config.txt")))) {
            oos.writeObject(config);
        }
    }
    public static GameConfig loadConfig(File path) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("config.txt")))) {
            GameConfig config = (GameConfig) ois.readObject();
            return config;
        }
    }
   /* public static void saveWorld(File path, World world){
   

    }

    public static World loadWorld(File path){

    }*/

}
