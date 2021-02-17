package ru.Mixer.City;

public enum BuildingTypeEnum {
    SOCIAL("Социальное"),
    LIVING("Жилое"),
    INDUSTRIAL("Промышленное");
    private final String rus;

    BuildingTypeEnum(String rus) {
        this.rus = rus;
    }

    public String getRus() {
        return rus;
    }

    @Override
    public String toString() {
        return "BuildingTypeEnum{" +
                "rus='" + rus + '\'' +
                '}';
    }
}

