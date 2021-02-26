package ru.Mixer.Lab1;

import java.util.Arrays;

public class GameServer {
    private  String ip;
    private int difficulty; // 1-3
    private  Entity[] entities;
    private static GameServer instance;
    private int tick = 0;

    public GameServer(String ip, int difficulty, Entity[] entities) {
        instance = this;
        this.ip = ip;
        this.difficulty = difficulty;
        this.entities = entities;
        while(true){
            tick++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < instance.entities.length; i++){
                if (instance.entities[i] != null && instance.entities[i].getHealth() <= 0){
                    instance.entities[i] = null;
                }
                if (instance.entities[i] != null ){
                    instance.entities[i].update();
                }
            }

        }
    }

    public static void main(String[] args){
        GameServer serv = new GameServer("ip", 2 , new Entity[]{
                new Entity( "Skeleton", 0,0,true, 10,10,2),
                new Entity("Cow", 10,10,false,15,15,0),
                new EntityPlayer("Puj",20,20, 50,50,4,"Pudge")
        } );
    }

    public void updateServer(){
        for (Entity entity : entities) {
            entity.update();
        }
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

    @Override
    public String toString() {
        return "GameServer{" +
                "ip='" + ip + '\'' +
                ", difficulty=" + difficulty +
                ", entities=" + Arrays.toString(entities) +
                ", instance=" + instance +
                ", tick=" + tick +
                '}';
    }}




