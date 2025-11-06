import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] arr = {10,20,40,5,2,1};
        System.out.println("array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorrted : " +Arrays.toString(arr));
        }
}