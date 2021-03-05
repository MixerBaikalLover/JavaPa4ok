package ru.Mixer.Interface;

public class Main {
    public static void main(String[] args){
        Pudge pudge = new Pudge();
        Cpeda cpeda = new Cpeda();
        Alien alien = new Alien();
        Dragon dragon = new Dragon();
        Zoo wtf = new Zoo("Wtfpark", new EntityLiving[]{
                pudge,cpeda,alien,dragon
        });
        wtf.feedPredators(cpeda);
    }
}
