package ru.skillbox;

import java.security.Key;

public class Computer {
    private  Processor processor;
    private  Memory memory;
    private  HardDrive hardDrive;
    private  Display display;
    private  Keyboard keyboard;
    private  String vendor;
    private  String name;

    public Computer(Processor processor,
                    Memory memory,
                    HardDrive hardDrive,
                    Display display,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
       this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;


    }

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;

    }


    public  Computer setProcessor(ProcessorVendor processorVendor, int frequency, int numberOfCore, int weight) {
         processor = new Processor(processorVendor, frequency, numberOfCore, weight);
        return new Computer(processor,memory, hardDrive, display, keyboard,vendor,name);
    }

    public  Computer setMemory(MemoryType memoryType, int volume, int weight) {
        //return new Memory(memoryType,volume,weight);
         memory = new Memory(memoryType, volume, weight);
        return new Computer(processor, memory, hardDrive, display, keyboard,vendor,name);
    }

    public  Computer setHardDrive(HardDriveType hardDriveType, int volume, int weight) {

         hardDrive = new HardDrive(hardDriveType, volume, weight);
        return new Computer(processor, memory, hardDrive, display, keyboard,vendor,name);
    }

    public  Computer setDisplay(DisplayType displayType, int diagonal, int weight) {
        //return new Memory(memoryType,volume,weight);
         display = new Display(displayType, diagonal, weight);
        return new Computer(processor, memory, hardDrive, display, keyboard,vendor,name);
    }

    public  Computer setKeyboard(KeyboardType keyboardType, boolean backlight, int weight) {
        //return new Memory(memoryType,volume,weight);
         keyboard = new Keyboard(keyboardType, backlight, weight);
        return new Computer(processor, memory, hardDrive, display, keyboard,vendor,name);
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

     public  String toString() {

        String info = "";
              info =  "Computer name :" + name + "\n" + "Computer vendor :" + vendor + "\n" +
                "Processor :" + " " + processor.getInfo() + "\n" +
                "Memory :" + " " + memory.getInfo() + "\n" +
                "Hard Drive :" + " " + hardDrive.getInfo() + "\n" +
                "Display :" + " " + display.getInfo() + "\n" +
                "Keyboard :" + " " + keyboard.getInfo();
        return info;

    }

    public  int totalWeight() {
        int totalWeight;
        totalWeight = display.getWeight() + keyboard.getWeight() +
                hardDrive.getWeight() + memory.getWeight() +
                processor.getWeight();
        return totalWeight;
    }

}
