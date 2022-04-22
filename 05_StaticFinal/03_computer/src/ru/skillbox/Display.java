package ru.skillbox;

public class Display {
    private final int diagonal;
    private static int weight;
    private final DisplayType displayType;

    public Display(DisplayType displayType, int diagonal, int weight) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.displayType = displayType;
    }

    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        String info = "Display Type - " + displayType + ",  diagonal - " + diagonal + " inch, "
                + "  weight - " + weight + " g ";
        return info;
    }
}
