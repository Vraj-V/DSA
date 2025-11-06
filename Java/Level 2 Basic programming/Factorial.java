// Factorial of a number
// Solution
/*Formula
 *  n! = n *(n -1)*(n-2)... so on
 * Example:
    * factorial 
    * let say n=5!
    * then 5*4*3*2*1
 */


/*
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
 * 7. add scanner to that variable.
 *      int num = scanner.nextInt();
 * 8. Run a for loop; start is int i =1; end is i <= num; and increment by +1 every time.
 * 9. declare a long fact = 1; outside the loop;
 * 10. Inside a loop:
 * 11.                fact = fact * i;
 * 12. print the fact using Sout.
      */

/*Pseudo code:
    *   1. Start
        2.import scanner;
        3. void main(){
        4. scanner sc = new Scanner(System.in);
        5.Take input N
        6. N = sc.nextInt();
        7. long fact =1;
        8. for loop(i=1;i<=num;i++):
        9.      fact = fact * i;
        10. exit loop;
        11. print   fact.
    */


    import java.util.*;
    public  class Factorial{
        public  static void  main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            long fact =1;

            for(int i =1; i<= num;i++){
                fact = fact * i;
            }
            System.out.println("Your factorial is : " +fact);
        }
    }