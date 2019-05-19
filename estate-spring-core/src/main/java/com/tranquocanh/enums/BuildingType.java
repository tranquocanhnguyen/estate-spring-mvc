package com.tranquocanh.enums;

public enum BuildingType {

    FURNITURE("Nội thất"),
    GROUND_FLOOR("Tầng trệt"),
    APARTMENT("Nguyên căn");

    private String value;

    BuildingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
