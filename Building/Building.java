package ru.Mixer.Building;

import java.util.Arrays;

public class Building {
    private String type;
    private Adress adress;
    private Apartment[] apartments;

    public Building(String type, Adress adress, Apartment[] apartments) {
        this.type = type;
        this.adress = adress;
        this.apartments = apartments;
    }
    public Building copy(){
        Building b1 = new Building(type, adress.copy(), new Apartment[apartments.length] );
            for(int i=0; i< apartments.length; i++){
                apartments[i] = apartments[i].copy();
            }
            return (b1);
    }

    public boolean hasApartmentOwner(int index){
        for (Apartment apartment : apartments) {
            return index == apartment.getIndex() && apartment.getOwner() != null;
        }
        System.out.println("Wrong index");
        return false;
    }
    public void removeApartmentOwner(int index){
        for (Apartment apartment : apartments) {
            if (index == apartment.getIndex() && apartment.getOwner() != null) {
                apartment.setOwner(null);
                return;
            }
        }
        System.out.println("Wrong index");

    }
    public String getApartmentOwner(int index){
        for (Apartment apartment : apartments) {
            if (index == apartment.getIndex() && apartment.getOwner() != null) {
                return apartment.getOwner();
            } else if(index == apartment.getIndex() && apartment.getOwner() == null) return "None";
        }
        return "Wrong index";
    }
    public void setApartmentOwner(int index, String newOwner){
        for (Apartment apartment : apartments) {
            if (index == apartment.getIndex() && apartment.getOwner() == null) {
                apartment.setOwner(newOwner);
                return;
            }
        }
        System.out.println("Has owner, remove previous owner");
    }



    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", adress=" + adress +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
}
