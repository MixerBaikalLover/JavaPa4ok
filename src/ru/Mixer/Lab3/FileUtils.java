package ru.Mixer.Lab3;

import java.io.*;

import com.google.gson.*;

public class FileUtils {
    public static void saveConfig(File path, GameConfig config) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(path);
        gson.toJson(config, writer);
        writer.flush();
        writer.close();
        System.out.println("Config saved!");
    }
    public static GameConfig loadConfig(File path) throws IOException, ClassNotFoundException {
        if(path.exists()){
            Gson gson = new Gson();
            System.out.println("Config load successful!");
            return gson.fromJson(new FileReader(path), GameConfig.class);
        }
        else {
            GameConfig config = new GameConfig();
            System.out.println("Can't find any config, created default configuration!");
            saveConfig(path,config);
            return config;
        }
    }
    public static void saveWorld(File path, World world) throws IOException {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(path);
        gson.toJson(world, writer);
        writer.flush();
        writer.close();
        System.out.println(world.getWorldName() + " Saved!");
    }

    public static World loadWorld(File path) throws IOException, ClassNotFoundException {
        if(path.exists()){
            Gson gson = new Gson();
            System.out.println("World load successful!");
            return gson.fromJson(new FileReader(path), World.class);
        }
        else {
            World world = new World("defaultWorld");
            System.out.println("Can't find any world, created default world!");
            saveWorld(path,world);
            return world;
        }
    }

}
