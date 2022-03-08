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

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public Bass() {
        this.setNumStrings(4);
        this.setBrandName("unknown");
        this.setWoodType("unknown");
    }

    public Bass(String brandName, String woodType) {
        this.setNumStrings(4);
        this.setBrandName(brandName);
        this.setWoodType(woodType);
    }

    public Bass(int numStrings, String brandName, String woodType) {
        this.setNumStrings(numStrings);
        this.setBrandName(brandName);
        this.setWoodType(woodType);
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
