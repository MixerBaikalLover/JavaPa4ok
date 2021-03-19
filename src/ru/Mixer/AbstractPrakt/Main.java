package ru.Mixer.AbstractPrakt;

import java.util.List;

public class Main {
    public static void main(String[] args){
        School sch = new School("Nevazhno", 3, 4, "CoolSchool");
        Teacher teacher = new Teacher("Pidj","Padj", "Pudj", 20, "Butchery", 2);
        Teacher teach = new Teacher("Sniper","Pudge", "Shooter", 20, "Shooting", 2);
        sch.addEntity(teacher);
        sch.addEntity(teach);
        System.out.println(sch);
        System.out.println(sch.getBuildingType());
        sch.workAll();
        Human hum = new Teacher("Nev", "Azh", "No", 0,"Nevazhno", 30);
        System.out.println(sch);
    }
}
