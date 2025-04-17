package Generics;

public class GenericMethod {
    // Generic method with bounded type parameter
    static <T extends Number> void add(T a, T b) {
        // Use specific numeric operation based on type (simplified example)
        if (a instanceof Integer && b instanceof Integer) {
            int sum = ((Integer) a).intValue() + ((Integer) b).intValue();
            System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        } else {
            double sum = a.doubleValue() + b.doubleValue();
            System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        }
    }

    public static void main(String[] args) {
        int a = 10;    // Autoboxed to Integer
        int b = 20;    // Autoboxed to Integer
        add(a, b);     // Works with Integer

        double x = 5.5;
        double y = 3.2;
        add(x, y);     // Works with Double
    }
}
