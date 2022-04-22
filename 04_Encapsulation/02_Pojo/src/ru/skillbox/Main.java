package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Country Russia = new Country("Russia");
        Russia.setArea(23563);
        System.out.println(Russia.getArea());
        System.out.println(Russia.getName());
        Russia.setCapitalName("mOSKAU");
        Russia.setPopulation(214134);
        Russia.setSeeAccess(false);
        System.out.println(Russia.getSeeAccess());
        System.out.println(Russia.getCapitalName());
        System.out.println(Russia.getPopulation());

        Smartphone iphone = new Smartphone(64, 4.3);
        iphone.setBatteryCapacity(3400);
        iphone.setColor("Black");
        System.out.println(iphone.getBatteryCapacity());
        System.out.println(iphone.getColor());
        System.out.println(iphone.getDiagonal());
        System.out.println(iphone.getMemory());
    }
}
