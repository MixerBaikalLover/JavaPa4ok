package ru.Mixer.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GameServer {
    private GameConfig config;
    private World serverWorld;
    private static GameServer instance;
    private int tick = 0;
    public GameServer(World world) throws IOException {

        instance = this;
        this.serverWorld = world;
        loadConfig();
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
           GameServer serv = new GameServer(loadWorld());
    }

    private void loadConfig() throws IOException{
        File defaultPath = new File("config.json");
        try {
            config = FileUtils.loadConfig(defaultPath);
        } catch (ClassNotFoundException e) {
            FileUtils.saveConfig(defaultPath, new GameConfig());
            config = new GameConfig();
        }
    }
    private void updateServer() throws IOException {
        serverWorld.update();
        if (tick % config.getSavePeriod() == 0) {
            instance.saveWorld();
            instance.saveConfig();
        }
        tick++;
    }
    public void saveConfig() throws IOException {
        File path = new File("config.json");
        FileUtils.saveConfig(path, config);
    }
    public void saveWorld() throws IOException {
        FileUtils.saveWorld(new File("world.json"), serverWorld);
    }
    private static World loadWorld() throws IOException {
        try {
            return FileUtils.loadWorld(new File("world.json"));
        } catch (FileNotFoundException | ClassNotFoundException e) {
            World world = new World("defaultWorld");
            FileUtils.saveWorld(new File("world.json"), world);
            System.out.println("Created new world");
            return world;
        }
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



