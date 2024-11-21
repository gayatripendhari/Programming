//WAJP to reverse a given number

import java.util.Scanner;

public class P3 {
        public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int d = n%10;
            n=n/10;
            rev = rev*10 + d;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Reverse of all digits of given number is: " + reverse(n));
    }

    
}
