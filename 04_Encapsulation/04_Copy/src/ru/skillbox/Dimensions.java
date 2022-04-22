package ru.skillbox;

public class Dimensions {
    private final double height;
    private final double width;
    private final double lenght;

    public Dimensions(double height, double width, double lenght) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(height, width, lenght);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(height, width, lenght);
    }

    public Dimensions setLenght(double lenght) {
        return new Dimensions(height, width, lenght);

    }

    public double volume() {
        return height * width * lenght;
    }

}
