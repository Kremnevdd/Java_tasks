package ru.skillbox;

public class Keyboard {
    private final boolean backlight;
    private static int weight;
    private final KeyboardType keyboardType;

    public Keyboard(KeyboardType keyboardType, boolean backlight, int weight) {
        this.weight = weight;
        this.keyboardType = keyboardType;
        this.backlight = backlight;
    }

    public int getWeight() {
        return weight;
    }

    public String getInfo() {
        String info = "";
        if (backlight) {
            info = "Keyboard Type - " + keyboardType + ", keyboard has a backlight, " + " weight - " + weight + " g ";

        }
        if (!backlight) {
            info = "Keyboard Type - " + keyboardType + ", keyboard has not a backlight, "
                    + " weight - " + weight + " g";
        }
        return info;
    }
}
