package ru.Mixer.Building;

public class Apartment {
    private int index;
    private String owner;
    private double square;
    private int rooms;

    public Apartment(int index, String owner, double square, int rooms) {
        this.index = index;
        this.owner = owner;
        this.square = square;
        this.rooms = rooms;
    }

    public Apartment copy(){
        return new Apartment(index, owner, square, rooms);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "index=" + index +
                ", owner='" + owner + '\'' +
                ", square=" + square +
                ", rooms=" + rooms +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
