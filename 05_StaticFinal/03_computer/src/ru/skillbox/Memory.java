package ru.skillbox;

public class Memory {
    private final int volume;
    private static int weight;
    private final MemoryType memoryType;


    public Memory(MemoryType memoryType, int volume, int weight) {
        this.volume = volume;
        this.weight = weight;
        this.memoryType = memoryType;

    }

    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        String info = "Memory Type - " + memoryType + ", volume - " + volume + " Mbytes,  weight - " + weight + " g ";
        return info;
    }
}
