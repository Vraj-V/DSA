// Question: How to use arrays and perform operations like sorting and substring?
// Answer: Arrays hold multiple values, we can sort them using Arrays.sort().

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Substring Example (using String, not array)
        String text = "HelloJava";
        System.out.println("Substring (0,5): " + text.substring(0,5));
    }
}
