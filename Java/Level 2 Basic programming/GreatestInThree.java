import java.util.Scanner;

public class GreatestInThree {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = input.nextInt();
        
        
        System.out.println("Enter second number : ");
        int b = input.nextInt();

        
        System.out.println("Enter third number : ");
        int c = input.nextInt();
    System.out.println("Result");
        if(a >b && a >c){
            System.out.println("A is largest");
            if(b > c){
                System.out.println("B is second larger");
                System.out.println("C is third large");

            }else{
                System.out.println("C is second larger");
                System.out.println("B is third large");
            }
        }

        if(b >a && b >c){
            System.out.println("B is largest");
            if(a> c){
                System.out.println("A is second larger");
                System.out.println("C is third large");

            }else{
                System.out.println("C is second larger");
                System.out.println("A is third large");
            }
        }

        if(c >b && c >a){
            System.out.println("C is largest");
            if(b > a){
                System.out.println("B is second larger");
                System.out.println("A is third large");

            }else{
                System.out.println("A is second larger");
                System.out.println("B is third large");
            }
        }
    }
}
