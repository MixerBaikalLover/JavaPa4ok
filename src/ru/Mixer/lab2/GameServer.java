package ru.Mixer.lab2;

import java.util.Arrays;
import java.util.List;

public class GameServer {
    private String ip;
    private int difficulty; // 1-3
    private World serverWorld;
    //private  Entity[] entities;
    private static GameServer instance;
    private int tick = 0;

    public GameServer(String ip, int difficulty, World world) {
        instance = this;
        this.ip = ip;
        this.difficulty = difficulty;
        this.serverWorld = world;
        instance.getServerWorld().addEntities(new Entity("Skeleton", 0, 0, true, 10, 10, 2, serverWorld));
        instance.getServerWorld().addEntities(new Entity("Cow", 10, 10, false, 15, 15, 0, serverWorld));
        instance.getServerWorld().addEntities(new EntityPlayer("Puj", 20, 15, 50, 50, 4,serverWorld, "Pudge"));

        while (true) {
            instance.updateServer();
            //System.out.println(getServerWorld().getEntitiesInRegion(0,0,30));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GameServer serv = new GameServer("ip", 2, new World("overworld"));
    }

    public void updateServer() {
        serverWorld.update();
        tick++;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }


    public static GameServer getInstance() {
        return instance;
    }

    public void setInstance(GameServer instance) {
        this.instance = instance;
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
                "ip='" + ip + '\'' +
                ", difficulty=" + difficulty +
                ", serverWorld=" + serverWorld +
                ", tick=" + tick +
                '}';
    }
}



