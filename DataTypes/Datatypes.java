package DataTypes;

class DataTypePrograms {

    // 1. Declare variables of different data types and display values
    static void displayVariables() {
        int a = 10;
        float b = 5.5f;
        double c = 99.99;
        char d = 'A';
        boolean e = true;
        String f = "Java";

        System.out.println("Different Data Types:");
        System.out.println("int = " + a);
        System.out.println("float = " + b);
        System.out.println("double = " + c);
        System.out.println("char = " + d);
        System.out.println("boolean = " + e);
        System.out.println("String = " + f);
    }

    // 2. Initialize and print all primitive data types
    static void primitiveTypes() {
        byte b = 100;
        short s = 20000;
        int i = 50000;
        long l = 100000L;
        float f = 12.5f;
        double d = 123.456;
        char c = 'J';
        boolean bool = false;

        System.out.println("\nPrimitive Data Types:");
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("char = " + c);
        System.out.println("boolean = " + bool);
    }

    // 3. Find size and range of primitive data types
    static void sizeAndRange() {
        System.out.println("\nSize and Range of Primitive Data Types:");

        System.out.println("Byte: Size = " + Byte.SIZE +
                " bits, Range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.println("Short: Size = " + Short.SIZE +
                " bits, Range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.println("Int: Size = " + Integer.SIZE +
                " bits, Range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.println("Long: Size = " + Long.SIZE +
                " bits, Range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("Float: Size = " + Float.SIZE +
                " bits, Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.println("Double: Size = " + Double.SIZE +
                " bits, Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("Char: Size = " + Character.SIZE + " bits");
    }

    // 4. Swap using third variable
    static void swapWithThirdVariable() {
        int x = 10, y = 20, temp;

        System.out.println("\nSwap Using Third Variable:");
        System.out.println("Before Swap: x = " + x + ", y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 5. Swap without using third variable
    static void swapWithoutThirdVariable() {
        int x = 30, y = 40;

        System.out.println("\nSwap Without Third Variable:");
        System.out.println("Before Swap: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap: x = " + x + ", y = " + y);
    }


    public static void main(String[] args) {

        displayVariables();

        primitiveTypes();

        sizeAndRange();

        swapWithThirdVariable();

        swapWithoutThirdVariable();
    }
}
