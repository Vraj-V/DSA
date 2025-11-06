// Program : Print the sum of give input number from user.
// Solution
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
 * 9. declare a int sum =0; outside the loop;
 * 10. Inside the loop
 *      sum += i;
 * 11. exit the loop; 
 * 12. print the sum using SOUT.
 * 
 * Mistakes
 * 1. does import scanner;
 * 2. new to add (System.in); in scanner.
 * 3. you need add scanner variable you , when collecting input in a variable.
 * 4. Like:        int num = scanner.nextInt();
 * 5. used + operator when you add value store inside a variable and display as Output using SOUT
 *  Like:          System.out.println("Sum of your N is : " +sum);
 */

 /*Pseudo code
  * 1. Start
  * 2. import java.util.scanner;
  * 3. Scanner sc = new Scanner(System.in);
  * 4. store input value in a num variable using scanner.nextInt();
  * 5. .nextInt() is used make sure the input must be in Integer.
    6. int sum =0;
  * 7. for loop:
        sum += i(for loop (i))
    8. exit loop
    9. print the sum
  */
import java.util.*;

public class SumToN {
    public static void main(String [] args){

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N value : ");
        int num = scanner.nextInt();
        
        int sum =0;
        for(int i =1; i <=num;i++){
            sum += i;
        }
        System.out.println("Sum of your N is : " +sum);
        
    }
}
