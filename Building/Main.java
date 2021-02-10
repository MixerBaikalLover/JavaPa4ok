package ru.Mixer.Building;

public class Main {
    public static void main(String[] args){
    Building b = new Building(
            "dom",
            new Adress("RU", "lenobl", "Bugry", "Pirogi", 25),
            new Apartment[]{
                    new Apartment(297,"me", 999, 2),
                    new Apartment(298,"hz",120,3)
            }
    );
        System.out.println(b.hasApartmentOwner(297));
        System.out.println(b.getApartmentOwner(297));
        b.removeApartmentOwner(297);
        System.out.println(b.getApartmentOwner(297));
        System.out.println(b);
        b.setApartmentOwner(297,"Pudj");
        System.out.println(b.getApartmentOwner(298));
        System.out.println(b.getApartmentOwner(299));



    }
}
