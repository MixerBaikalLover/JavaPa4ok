package ru.Mixer.AbstractPrakt;

public class Main {
    public static void main(String[] args){
        School sch = new School("Nevazhno", 3, 4, "CoolSchool", new Teacher[1]
        ,new Student[]{
                new Student("nu","ya","da", 12,8),
                new Student("asd","dsa","to", 20,1)
        } );
        System.out.println(sch);
        sch.getBuildingType();
        sch.workAll();
        Human hum = new Teacher("Nev", "Azh", "No", 0,"Nevazhno", 30);
        System.out.println(sch.addEntity(hum));
        System.out.println(sch);
    }
}
