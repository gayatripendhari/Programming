//WAJP to find factors of a number .

import java.util.Scanner;

public class P6 {
        public static void factor(int n){
        int res = 2;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                res++;
                System.out.print(i+", ");

            }
        }
        //System.out.println(res);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        System.out.println("Count of Factors of given number is: 1,  "+n);
        factor(n);
    }

    
}
