package ru.Mixer.Lab1;

import java.util.Arrays;

public class GameServer {
    private static  String ip;
    private static  int difficulty; // 1-3
    private   Entity[] entities;
    private static GameServer instance;
    private static int tick = 0;

    public GameServer(int difficulty, Entity[] entities) {
        GameServer.difficulty = difficulty;
        this.entities = entities;
        instance = this;
    }

    public static void main(String[] args){
        GameServer serv = new GameServer( 2 , new Entity[]{
                new Entity( "Skeleton", 0,0,true, 10,10,2),
                new Entity("Cow", 10,10,false,15,15,0),
                new EntityPlayer("Puj",20,20, 50,50,4,"Pudge")
        } );
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
        GameServer.tick = tick;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        GameServer.ip = ip;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        GameServer.difficulty = difficulty;
    }

    public Entity[] getEntities() {
        return entities;
    }

    public void setEntities(Entity[] entities) {
        this.entities = entities;
    }
}
