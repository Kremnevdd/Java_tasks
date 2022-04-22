public class Arithmetic {
    private int a = 0;
    private int b = 0;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int amount() {
        return a + b;
    }

    public int difference() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int average() {
        return (a + b) / 2;
    }

    public int max() {
        int c = 0;
        if (a < b)
            c = b;
        if (b < a)
            c = a;
        return c;
    }

    public int min() {
        int c = 0;
        if (a < b)
            c = a;
        if (a > b)
            c = b;
        return c;
    }

}
