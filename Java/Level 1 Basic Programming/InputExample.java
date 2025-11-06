// Question: How to take input in Java?
// Answer: Use Scanner class.

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", Age: " + age);
        scanner.close();
    }
}
