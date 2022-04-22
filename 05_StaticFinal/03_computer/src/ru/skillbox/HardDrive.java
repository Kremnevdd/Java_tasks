package ru.skillbox;

public class HardDrive {
    private final int volume;
    static private int weight;
    private final HardDriveType hardDriveType;

    public HardDrive(HardDriveType hardDriveType, int volume, int weight) {
        this.volume = volume;
        this.weight = weight;
        this.hardDriveType = hardDriveType;
    }

    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        String info = "DriveType - " + hardDriveType + ",  volume - " + volume + " GB,  weight - " + weight + "g";
        return info;
    }
}
