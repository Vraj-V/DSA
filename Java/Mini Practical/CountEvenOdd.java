
import java.util.*;
import java.io.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int EvenCount =0;
        int OddCount =0;

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i =0  ; i < num; i++){

            int number = sc.nextInt();
            if(number % 2 == 0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }


        System.out.println("Even Numbers are : " +EvenCount);
        System.out.println("Odd Numbers are : " +OddCount);

    }
}
