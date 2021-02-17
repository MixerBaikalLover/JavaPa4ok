package ru.Mixer.Lab1;

import java.util.Arrays;

public class GameServer {
    private static  String ip;
    private static  int difficulty; // 1-3
    public   Entity[] entities;
    private static GameServer instance;
    public static int tick = 0;

    public GameServer(int difficulty, Entity[] entities) {
        this.difficulty = difficulty;
        this.entities = entities;
        instance = this;
    }

    public static void main(String[] args){
        GameServer serv = new GameServer( 2 , new Entity[]{
                new Entity(1, "Skeleton", 0,0,true, 10,10,2),
                new Entity(2,"Cow", 10,10,false,15,15,0),
                new EntityPlayer(3,"Puj",20,20,false,50,50,4,"Pudge")
        } );
        while(true){
            tick++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            serv.entities[0].update();
            System.out.println(serv.entities[0]);
            System.out.println(serv.entities[1]);
            System.out.println(serv.entities[2]);
        }
    }

    public GameServer() {
        instance = this;

    }

    public void updateServer(){
        for (Entity entity : entities) {
            entity.update();
        }
    }
    @Override
    public String toString() {
        return "GameServer{" +
                "ip='" + ip + '\'' +
                ", difficulty=" + difficulty +
                ", entities=" + Arrays.toString(entities) +
                '}';
    }


    public static GameServer getInstance() {
        return instance;
    }

    public static void setInstance(GameServer instance) {
        GameServer.instance = instance;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
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

    public Entity[] getEntities() {
        return entities;
    }

    public void setEntities(Entity[] entities) {
        this.entities = entities;
    }
}
