//WAJP to count number of digits in a given number.
import java.util.Scanner;
public class P2B {
    public static int count(int n){
        int count =0;
        while (n!=0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= s.nextInt();
        System.out.println("Number of digits in given number is:"+count(n));
    }
    
}
