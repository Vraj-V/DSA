// Question: What are Primitive and Non-Primitive Data Types in Java?
// Answer: 
// Primitive types store simple values directly (byte, short, int, long, float, double, char, boolean).
// Non-Primitive types store references to objects (String, Array, Class, Object).

public class dataType {
    public static void main(String[] args) {
        // Primitive Data Types
        byte i = 1;
        short j = 2;
        int num = 12;
        long number = 121312890112L;
        float decimal = 3.123123F;
        double numbers = 12.1244;
        char symbol = '@';
        boolean isTrue = true;

        // Non-Primitive Types
        String name = "vraj";
        int[] array = {10, 20, 20};

        class Person {
            String pname;
            int age;
        }

        Person obj = new Person();
        obj.pname = "vraj";
        obj.age = 21;

        System.out.println("Primitive and Non-Primitive Types Example Complete!");
    }
}
