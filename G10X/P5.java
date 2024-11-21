//WAJP to find out n^p  

import java.util.Scanner;

public class P5 {
        public static int power(int n,int p){
        int res = 0;
        for(int i=0;i<=p;i++){
            res *= n;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Enter any second number: ");
        int p = s.nextInt();
        System.out.println(p+" th power of a given number "+ n + " is: " + power(n,p));
    }

}
