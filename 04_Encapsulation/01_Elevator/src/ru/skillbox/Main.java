package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(-2, 25);
        elevator.moveUp();
        System.out.println(elevator.getCurrentFloor());
        elevator.move(16);
        System.out.println(elevator.getCurrentFloor());
        elevator.move(-3);
        System.out.println(elevator.getCurrentFloor());


    }
}
