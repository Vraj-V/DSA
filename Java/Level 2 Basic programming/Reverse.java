// package DSA.Java.Level 2 Basic programming;
// Reverse a number

/*Solution =
/*Analysis code:
 * 1. import java.util.* || import java.util.Scanner;
 *      this scanner is used for taking input from user and scanner the input every time.
 * 2. Declare a public class with fileName;
 *      class is property that define an object and object are nothing but collect of data.
 * 3. Declare a void main(String[]args) in order to perform the operations.
 *      this store the operation and help to save data.
 * 4. add Scanner = new Scanner(System.in)  in function;
 *      this scanner is now connected to system and ready to take input.
 * 5. SOUT ( "enter your n");
 *      used to tell user what to give an input.
 * 6. declare int and variable to save input
 * */
//Reverse the number"


/*Analysisc
 * 1. Import scanner using java.util*;
 * 2. declare class same as file name;
 * 3. declare static void main (String[] args) function;
 * 4.add new scanner to connect with System.in ; Scanner sc = new Scanner(System.in);
 * 5.Take input from use in number , print System.out.println("");
 * 6.Store the input value using scanner you created and .nextLine();
 * 7. declare the value as int num, and declare another variable as reverseNum =0;
 * 8. run a while loop (num != 0), use while we because we dont have inital starting value, we know we have end loop when num = 0, until run the loop.
 * 9. declare digit = num%10; //this give a reminder of num //example num 1234 and 1234%10 reminder =4; so 4 will be store inside a digit;
 * 10. reverseNum = reverseNum(previous store value) *10 + digit; // in order to get exact reverse, we must consider we have place the digit in 1th,10th,100th place of the digit, so we have *10 , in order to get 1th,10th place in a number.
 *  so we reverseNum*10 and then add new digit into reverseNum , and update Reversum value everytime.
 * 11. now we have update num value also as num = num /10 ; // this will remove last digit from the number and it will loop again until num=0;
 *
 *
 *Pseudo Code:
    1. Start
    2.import scanner
    3. scanner sc = new Scanner(System.in);
    4.Print the enter the input of number
    5.store input as int num = sc.nextInt();
    6. int ReverseNum =0;
    7. while(num !=0 ):
    8.      int digit = num %10;
    9.      reverseNum = reverseNum *10 + digit;
    10.     num = num/10;
    11. exit loop;
    12. print ReverseNum;
 */
    /* //Code
        import  java.util.*;
        public class Reverse {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter any 4 digit number :");
                int num = sc.nextInt();
                int reverseNum =0;

                while (num != 0){
                    int digit = num%10;
                    System.out.println("Digit is :" +digit);
                    reverseNum = reverseNum *10 + digit;
                    System.out.println("Reverse is :" +reverseNum);
                    num = num/10;
                    System.out.println("Number is :" +num);

                }

                System.out.println("YOur reversed number is :" +reverseNum);
                
            }
        }
    */

    // Reverse a string;

    import java.util.*;

    public  class Reverse{
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            String reveString = "";

            for( int i = name.length() -1 ;i >=0; i--){
                reveString += name.charAt(i);
            }
            System.out.println("YOur Reversed name is :" +reveString);
        }
    }