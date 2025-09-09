// Question: What are conditional statements in Java?
// Answer: if, else if, else, and switch are conditional statements.

public class ConditionExample {
    public static void main(String[] args) {
        int num = 15;

        if (num > 20) {
            System.out.println("Greater than 20");
        } else if (num == 20) {
            System.out.println("Equal to 20");
        } else {
            System.out.println("Less than 20");
        }

        // Switch example
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other Day");
        }
    }
}
