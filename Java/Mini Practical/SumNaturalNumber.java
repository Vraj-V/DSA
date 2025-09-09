import java.util.*;

public class SumNaturalNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the value for sum of n :");
        n = sc.nextInt();

        int i,temp =0;
        System.out.println("Natural n sum is : ");
        for( i=1;i <=n; i++){
             temp = temp + i;

            System.out.println("Sum of Natural : " + temp);
        }
    }
}
