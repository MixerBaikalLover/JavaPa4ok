package ru.Mixer.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class World {
    private static int idCounter = 1;
    private final long id;
    private String worldName;
    private List<Entity> entities = new ArrayList<>();

    public World(String worldName) {
        this.id = idCounter;
        idCounter ++;
        this.worldName = worldName;
    }

    public void update() {
        for(int i = entities.size() - 1; i >= 0; i--){
            if (entities.get(i) != null && entities.get(i).getHealth() <= 0) {
                entities.remove(i);
            }
            if(entities.get(i) != null) entities.get(i).update();
        }
    }
    //возращает отсортированный в порядке близости точке x/z список сущностей
    public List<Entity> getEntitiesInRegion(double posX, double posZ, double range){
        List<Entity> buffer = new ArrayList<>();
        for(int i = entities.size() - 1; i >= 0; i--){
            if(entities.get(i) != null) {
                double entityX = entities.get(i).getPosX();
                double entityZ = entities.get(i).getPosZ();
                entities.get(i).setDistance(Math.sqrt(Math.pow((posX - entityX), 2) + Math.pow((posZ - entityZ), 2)));
                if (entities.get(i).getDistance() <= range) buffer.add(entities.get(i));
            }
        }
        Collections.sort(buffer, new Comparator<Entity>() {
            @Override
            public int compare(Entity a, Entity b) {
                return Double.compare(a.getDistance(),b.getDistance() );
            }
        });
        return buffer;
    }
    //возращает отсортированный в порядке близости точке entity.posX/entity.posZ список сущностей
    public List<Entity> getEntitiesNearEntity(Entity entity, double range){

        return getEntitiesInRegion(entity.getPosX(), entity.getPosZ(), range);
    }


    @Override
    public String toString() {
        return "World{" +
                "id=" + id +
                ", worldName='" + worldName + '\'' +
                ", entities=" + entities +
                '}';
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        World.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public List<Entity> getEntities() {
        return entities;
    }
    public void addEntities(Entity entity){
        entities.add(entity);
    }
    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
}
