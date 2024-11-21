//WAJP to calculate sum of Digits in a given number

import java.util.Scanner;
class P1A{
    public static int sum(int n){
        int res = 0;
        while(n!=0){
            int d =n%10;
            n/=10;
            res += d;
        }
        return res;


    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n= s.nextInt();
        System.out.println("Sum of all Digits of a given number: "+sum(n));
    }
}