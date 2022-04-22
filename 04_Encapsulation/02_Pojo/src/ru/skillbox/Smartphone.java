package ru.skillbox;

public class Smartphone {
    private String color;
    private double diagonal;
    private int batteryCapacity; // в часах
    private int memory;

    public Smartphone(int memory, double diagonal){
        this.memory= memory;
        this.diagonal = diagonal;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }
}
