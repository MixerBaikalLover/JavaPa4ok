package ru.Mixer.Computer;

public class Main {
    public static void main(String[] args){
        Computer comp = new Computer(
                new CPU("kukuruzen", 6, 3.3f, 3.6f),
                new GPU("1060", 6,false),
                new Memory[]{
                        new Memory(8, 3200),
                        new Memory(8, 3200)
                }
        );
        Computer comp1 = comp.copy();
        CPU i7 = new CPU("i7-3770", 4, 3.3f, 3.7f);
        comp1.setCpu(i7);
        System.out.println("Specs:");
        System.out.println(comp1);
        System.out.print("Rating: ");
        System.out.println(comp.getRating(comp1.getCpu(), comp1.getGpu()));
        System.out.println("Specs:");
        System.out.println(comp);
        System.out.print("Rating: ");
        System.out.println(comp.getRating(comp.getCpu(), comp.getGpu()));
    }
}
