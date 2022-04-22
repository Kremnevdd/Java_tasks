package ru.skillbox;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = -4;
    private int maxFloor = 30;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;

    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor--;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void move(int level) {
        if (level > maxFloor) {
            System.out.println("Uncorrected floor,too high");
            return;

        }
        if (level < minFloor) {
            System.out.println("Uncorrected floor, too low");
            return;
        }
        if (level > currentFloor) {
            while (level != currentFloor) {
                moveUp();
            }
        }
        if (level < currentFloor) {
            while (level != currentFloor) {
                moveDown();
            }
        }
    }
}
