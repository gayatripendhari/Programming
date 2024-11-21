//WAJP to calculate sum of digits in a given number.

import java.util.Scanner;
class P1{
    public static int sum(int n){
        int res = 0;
        while(n!=0){
            int d = n%10;
            n=n/10;
            res = res + d;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Sum of all digits of given number is: " + sum(n));
    }
}