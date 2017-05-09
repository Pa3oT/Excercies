package main.enums;

public enum MyEnum {
    Monday("Mon"),
    Tuesday("Tue");


    private final String shortName;

    private MyEnum(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
