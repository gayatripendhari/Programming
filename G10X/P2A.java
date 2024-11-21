//WAJP to count the number of digits in a given number

import java.util.Scanner;

public class P2 {
    public static int count(int n){
        int res = 0;
        while(n!=0){
            //int d = n%10;
            n=n/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Count of all digits of given number is: " + count(n));
    }

    
}
