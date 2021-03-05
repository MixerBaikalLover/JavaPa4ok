package ru.Mixer.Interface;

import java.util.Arrays;

public class Zoo {
    String title;
    EntityLiving[] animals;

    public Zoo(String title, EntityLiving[] animals) {
        this.title = title;
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "title='" + title + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EntityLiving[] getAnimals() {
        return animals;
    }

    public void setAnimals(EntityLiving[] animals) {
        this.animals = animals;
    }

    public int getFlyEntityCount(){
        int j = 0;
        for(int i = 0; i < animals.length; i++){
            if(animals[i] != null && animals[i] instanceof IFlyEntity) j++;
        }
        return j;
    }
    public int getPredatorEntityCount(){
        int j = 0;
        for(int i = 0; i < animals.length; i++){
            if(animals[i] != null && animals[i] instanceof IPredator) j++;
        }
        return j;
    }
    public int getSoundEntityCount(){
        int j = 0;
        for(int i = 0; i < animals.length; i++){
            if(animals[i] != null && animals[i] instanceof ISoundEntity) j++;
        }
        return j;
    }
    public void feedPredators(EntityLiving entity){
    if (entity != null) {
        if (entity instanceof IPredator) System.out.println("Не лезь, она тебя сожрет");
        else {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof IPredator) {
                    ((IPredator) animals[i]).hunt(entity);
                }
            }
        }
    }
}


}
