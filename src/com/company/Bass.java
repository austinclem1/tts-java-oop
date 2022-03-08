package com.company;

public class Bass {
    private int numStrings;
    private String brandName;
    private String woodType;

    public int getNumStrings() {
        return numStrings;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getWoodType() {
        return woodType;
    }

    public Bass() {
        this.numStrings = 4;
        this.brandName = "unknown";
        this.woodType = "unknown";
    }

    public Bass(String brandName, String woodType) {
        this.numStrings = 4;
        this.brandName = brandName;
        this.woodType = woodType;
    }

    public Bass(int numStrings, String brandName, String woodType) {
        this.numStrings = numStrings;
        this.brandName = brandName;
        this.woodType = woodType;
    }

    public boolean isFourString() {
        return this.numStrings == 4;
    }

    public String commenceSlaps(int numSlaps) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numSlaps; i++) {
            result.append("Slap");
        }
        return result.toString();
    }
}
