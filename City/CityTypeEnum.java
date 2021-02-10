package ru.Mixer.City;

public enum CityTypeEnum {
    VILLAGE("Деревня"),
    URBAN_VILLAGE("ПГТ"),
    TOWN("Город"),
    METROPOLIS("Мегаполис");
    private final String rus;

    CityTypeEnum(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }

    @Override
    public String toString() {
        return "CityTypeEnum{" +
                "rus='" + rus + '\'' +
                '}';
    }
}
