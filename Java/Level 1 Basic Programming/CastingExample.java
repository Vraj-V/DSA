// Question: What is type casting in Java?
// Answer: Converting one data type into another.

public class CastingExample {
    public static void main(String[] args) {
        int num = 10;
        double d = num; // Implicit Casting
        System.out.println("Implicit Casting int -> double: " + d);

        double x = 9.78;
        int y = (int) x; // Explicit Casting
        System.out.println("Explicit Casting double -> int: " + y);
    }
}
