package OopsConcept;

class Calculator {

    void add(int a, int b) {
        System.out.println("Addition of 2 numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition of 3 numbers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Addition of double values: " + (a + b));
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10, 20, 30);
        c.add(5.5, 4.5);
    }
}