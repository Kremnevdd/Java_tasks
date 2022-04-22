package ru.skillbox;

public class ArithmeticCalculator {
    private int a;
    private int b;


    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int calculate(Operation operation) {
        int c = 0;
        switch (operation) {
            case ADD:
                c = a + b;
                break;

            case MULTIPLY:
                c = a * b;
                break;

            case SUBTRACT:
                c = a - b;
                break;
        }
        return c;
    }

}
