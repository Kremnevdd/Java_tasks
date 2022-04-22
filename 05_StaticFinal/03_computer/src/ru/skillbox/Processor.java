package ru.skillbox;

public class Processor {
    private final ProcessorVendor processorVendor;
    private final int frequency;
    private final int numberOfCore;
    private final int weight;

    public  Processor(ProcessorVendor processorVendor, int frequency, int numberOfCore, int weight) {
        this.processorVendor = processorVendor;
        this.frequency = frequency;
        this.numberOfCore = numberOfCore;
        this.weight = weight;

    }


    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        String info = "Vendor - " + processorVendor + ", frequency - " + +frequency + " MHz," + "\n" +
                "number of cores - " + numberOfCore + ", weight - " + weight + " g ";
        return info;
    }

}
