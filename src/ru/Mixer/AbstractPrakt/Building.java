package ru.Mixer.AbstractPrakt;

public abstract class Building {
    protected String address;
    protected int floorCount;
    protected BuildingTypeEnum type;
    public abstract BuildingTypeEnum getBuildingType();

    public Building(String address, int floorCount) {
        this.address = address;
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}
