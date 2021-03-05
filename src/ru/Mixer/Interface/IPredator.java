package ru.Mixer.Interface;

public interface IPredator {
    public default void hunt(EntityLiving entity){
        System.out.println(this + " Кого его " + entity);
    }
}
