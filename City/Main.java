package ru.Mixer.City;

public class Main {
    public static void main(String[] args){
        City spb = new City("SPB", CityTypeEnum.METROPOLIS, 999999999, new Building[]{
                new Building(new Address("rand", 2, 0), BuildingTypeEnum.INDUSTRIAL, 2),
                new Building(new Address("rand2", 1, 1), BuildingTypeEnum.LIVING, 20)
        });

        System.out.println(spb.hasBuildingByAddress(new Address("rand", 2 , 0)));
        System.out.println(spb.hasBuildingByAddress(new Address("rand123", 2 , 0)));
        System.out.println(spb.getBuildingByAddress(new Address("rand", 2 , 0)));
        System.out.println(spb.getBuildingByAddress(new Address("randawdasd", 2 , 0)));

    }
}
