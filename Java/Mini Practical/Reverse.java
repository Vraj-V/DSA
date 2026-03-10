import java.util.Scanner;
import java.util.*;
// public  class Reverse{
//     public static void main(String[] args) {
        

//         Scanner scan = new Scanner(System.in);
    
//         System.out.println("Enter the number: ");
//         int num = scan.nextInt();
//         int ReversedNum = 0;
//         int temp = num;
//             // while need to use because we know the end condtion, not the starting
//             while(num != 0){
//                 int digit = num%10;
//                 System.out.println("Digit: " +digit);
//                 ReversedNum = ReversedNum * 10 + digit;
//                 System.out.println("Reversed Number  : " +ReversedNum);
//                 num = num/10;
//             }
//             System.out.println("Original Number: " +temp);
//             System.out.println("Reversed Number :" +ReversedNum);
//     }
// }

// // Logic
// /*
//     123

//     *** in number 1 = 100th digit place according to number system, 2 = 10th place number holder, 3 = 1st place holder in number
//     so in reverse:
//     3= 100th place,
//     2- 10th place,
//     1 = 1th place holder


//     so simple we need to move the place holder value,

//     If interview asked to this without using array, then this method will work , other using array as simplest
// */


// public class Reverse{
//     // For String;

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = scan.nextLine();
//         String ReversedString = "";

//         for(int i =str.length()-1;i>=0;i--){
//             ReversedString += str.charAt(i);
//         }

//         System.out.println("Reversed String: " +ReversedString);
    
//     }
// }

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array:");
        int num = sc.nextInt();

        int[] numArray = new int[num];

        System.out.println("Enter elements:");

        for(int i = 0; i < num; i++){
            numArray[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:");

        for(int i = numArray.length - 1; i >= 0; i--){
            System.out.print(numArray[i] + " ");
        }

    }
}