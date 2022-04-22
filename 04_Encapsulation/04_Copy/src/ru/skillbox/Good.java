package ru.skillbox;

public class Good {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean flipOk;
    private final int regNumber;
    private final boolean fragility;

    public Good(Dimensions dimensions, double weight, String address, boolean flipOk, int regNumber, boolean fragility) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.flipOk = flipOk;
        this.regNumber = regNumber;
        this.fragility = fragility;
    }

    public Good setWeight(double weight) {
        return new Good(dimensions, weight, address, flipOk, regNumber, fragility);
    }

    public Good setAddress(String address) {
        return new Good(dimensions, weight, address, flipOk, regNumber, fragility);
    }

    public Good setHeight(double height) {
        return new Good(dimensions.setHeight(height), weight, address, flipOk, regNumber, fragility);
    }

    public Good setWidth(double width) {

        return new Good(dimensions.setWidth(width), weight, address, flipOk, regNumber, fragility);
    }

    public Good setLenght(double lenght) {

        return new Good(dimensions.setLenght(lenght), weight, address, flipOk, regNumber, fragility);
    }

}
