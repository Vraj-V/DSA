// Find even & odd numbers between 1–100
// Solution
/*
/*Analysis code:
 * 1. import java.util.* || import java.util.Scanner; 
 *      this scanner is used for taking input from user and scanner the input every time.
 * 2. Declare a public class with fileName;
 *      class is property that define an object and object are nothing but collect of data.
 * 3. Declare a void main(String[]args) in order to perform the operations.
 *      this store the operation and help to save data.
 * 4. Run a while loop
 * 5. add if-else condition inside a loop.
 * 6.if( i%2 =0) return even;
 * 7.else return odd;
 * 8. exit the loop
 * 
 * must declare num as 1 at begin of void main function used that in loop as condition
 * 
 *  */
/*Pseudo code: 
 * 1. Start
 * 2.int num =1;
 * 3.while loop:
 * 4.    if( num%2=0):
 * 5.        return even
 * 6.    else:
 * 7.        return odd;
 * 8.  num++;
 * 9.exit the loop;
 */

 public  class EvenOddNum {
    public static void main(String[] args) {
        
        int num =1;
        while(num <=100){
            if(num%2 == 0){
                System.out.println("Even " +num);
            }
            // else{
            //     System.out.println("Odd " +num);
            // }
            num++;
        }
    }
    
 }