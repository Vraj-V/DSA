import java.util.Scanner;

public class MultipleTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the number you want to table of :");

        n = sc.nextInt();
        
        System.out.println("Number of count :");
        m = sc.nextInt();
        
        int i,table;
        for ( i=1; i <=m; i++){
            
            table = n* i;
            System.out.println("Table of " +n+ " is "+i+ " : " +table);

        }
    }
}
/*Multiple table
 * in this problem we need 2 input from user one is n, m 
 *  n= table number  they want to print
 * m = count of number of till which number they want the table.
 * 
 * how the loop work
    * you create a for loop 
    * in which you int i and count of number and end of till of m(given by user) and increment by ever number.
*How multiplication is working'
     n is the number user of multiple and m is time it want to multiple and 
     in loop i is incrememnt by +1 each time.
     so we multiple n (number of table) * i (increment till m is reach)
Done!
 */