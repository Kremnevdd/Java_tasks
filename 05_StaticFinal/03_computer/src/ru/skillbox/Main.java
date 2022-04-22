package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Computer lenovo = new Computer("lenovo", "S342");
        lenovo.setProcessor(ProcessorVendor.AMD, 4000, 8, 15);
        lenovo.setMemory(MemoryType.DDR2, 1024, 10);
        lenovo.setHardDrive(HardDriveType.SSD, 512, 30);
        lenovo.setDisplay(DisplayType.IPS, 17, 50);
        lenovo.setKeyboard(KeyboardType.MEMBRANNED, false, 25);
        System.out.println(lenovo.toString());
/*
        Computer hp = new Computer("HP", "A812");
        hp.setProcessor(ProcessorVendor.INTEL, 2800, 4, 12);
        hp.setMemory(MemoryType.DDR3, 2048, 8);
        hp.setHardDrive(HardDriveType.HDD, 512, 25);
        hp.setDisplay(DisplayType.VA, 20, 48);
        hp.setKeyboard(KeyboardType.MECHANIC, true, 20);

        Computer asus = new Computer("asus", "SJ983");
        asus.setProcessor(ProcessorVendor.INTEL, 3400, 6, 17);
        asus.setMemory(MemoryType.DDR3, 4096, 12);
        asus.setHardDrive(HardDriveType.HDD, 1024, 38);
        asus.setDisplay(DisplayType.TN, 23, 53);
        asus.setKeyboard(KeyboardType.MEMBRANNED, true, 18);
        */
        System.out.println(lenovo.toString());
      //  System.out.println("---------------");
      /*  System.out.println(hp.toString());
        System.out.println("---------------");
        System.out.println(asus.toString());*/


    }
}
