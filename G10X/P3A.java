//WAJP to reverse a number
import java.util.Scanner;
public class P3A {
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d= n%10;
            n/=10;
            rev = rev*10+d;
        }
        return rev;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("orginal number is: "+ n);
        System.out.println("reversed number is: "+reverse(n));
    }
}
