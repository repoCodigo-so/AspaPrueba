package com.example.aspaprueba;

public class ColorItem {
    private String colorName;
    private int colorResId;

    public ColorItem(String colorName, int colorResId) {
        this.colorName = colorName;
        this.colorResId = colorResId;
    }

    public String getColorName() {
        return colorName;
    }

    public int getColorResId() {
        return colorResId;
    }
}
