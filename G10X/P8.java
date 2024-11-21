//WAJP to check whether a given number is Prime number;

import java.util.Scanner;

public class P8 {
            public static boolean isPrime(int n){
        int count = 2;
        boolean result = false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                if(count>2){
                    break;
                }
            }
        }
        if(count==2){
            result = true;
        }
        else{
            result=false;
        }
        return result;
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        if(isPrime(n)){
            System.out.println("Given number is Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
        
    }
    
}
