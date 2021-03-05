package ru.Mixer.Interface;

public class Cpeda extends EntityLiving implements ISoundEntity {
    public Cpeda() {
        super("Вова", "ну студент");
    }

    @Override
    public String toString() {
        return "Cpeda{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String getSound() {
        return "Ааа питон ненавижу";
    }
}
