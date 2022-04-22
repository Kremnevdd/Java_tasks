package ru.skillbox;

public class Country {
    private String name;
    private int population;
    private double area;
    private String capitalName;
    private boolean seeAccess;

    public Country(String name) {
        this.name = name;

    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setSeeAccess(boolean seeAccess) {
        this.seeAccess = seeAccess;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public boolean getSeeAccess() {
        return seeAccess;
    }

    public int getPopulation() {
        return population;
    }


}
