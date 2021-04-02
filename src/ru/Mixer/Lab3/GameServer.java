package ru.Mixer.Lab3;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.*;
import java.nio.file.*;

import static ru.Mixer.Lab3.FileUtils.loadConfig;
import static ru.Mixer.Lab3.FileUtils.saveConfig;

public class GameServer {
    private GameConfig config;
    private World serverWorld;
    private static GameServer instance;
    private int tick = 0;

    public GameServer( World world) {
        instance = this;
        //this.config = config;
        this.serverWorld = world;
        instance.getServerWorld().addEntities(new Entity("Skeleton", 0, 0, true, 10, 10, 2, serverWorld));
        instance.getServerWorld().addEntities(new Entity("Cow", 10, 10, false, 15, 15, 0, serverWorld));
        instance.getServerWorld().addEntities(new EntityPlayer("Player", 20, 15, 50, 50, 4,serverWorld, "Pudge"));

        while (true) {
            instance.updateServer();
            try {
                Thread.sleep(config.getUpdatePeriod());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
           GameServer serv = new GameServer( new World("overworld"));
           serv.loadConfig();
    }

    private void loadConfig() throws IOException{
        File path = new File("config.txt");
        try {
            config = FileUtils.loadConfig(path);
        } catch (ClassNotFoundException e) {
            config = new GameConfig();
            saveConfig(path, config);
        }
    }
    private void updateServer() {
        serverWorld.update();
        tick++;
    }

    public GameConfig getConfig() {
        return config;
    }

    public void setConfig(GameConfig config) {
        this.config = config;
    }

    public static GameServer getInstance() {
        return instance;
    }

    public void setInstance(GameServer instance) {
        GameServer.instance = instance;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }

    public World getServerWorld() {
        return serverWorld;
    }

    public void setServerWorld(World serverWorld) {
        this.serverWorld = serverWorld;
    }

    @Override
    public String toString() {
        return "GameServer{" +
                ", serverWorld=" + serverWorld +
                ", tick=" + tick +
                '}';
    }
}



