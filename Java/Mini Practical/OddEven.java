import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter any number : ");
         number = sc.nextInt();
        if( number % 2 == 0){
            System.out.println(number + " :This number is even ");
        }else{
            System.out.println(number + " This number is odd");
        }
    }
}