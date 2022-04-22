package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calc = new ArithmeticCalculator(3,5);
        System.out.println(calc.calculate(Operation.ADD));
        System.out.println(calc.calculate(Operation.MULTIPLY));
        System.out.println(calc.calculate(Operation.SUBTRACT));
    }
}
