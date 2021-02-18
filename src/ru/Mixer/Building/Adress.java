package ru.Mixer.Building;


public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private int buildingIndex;

    public Adress(String country, String region, String city, String street, int buildingIndex) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.buildingIndex = buildingIndex;
    }

    public Adress copy(){
        return new Adress(country, region, city, street, buildingIndex);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingIndex=" + buildingIndex +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingIndex() {
        return buildingIndex;
    }

    public void setBuildingIndex(int buildingIndex) {
        this.buildingIndex = buildingIndex;
    }
}
