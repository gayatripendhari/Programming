//WAJP to calculate a factorial of a given number

import java.util.Scanner;

public class P4 {
        public static int factorial(int n){
        int res = 1;
        for(int i =2;i<=n;i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Sum of all digits of given number is: " + factorial(n));
    }

    
}
