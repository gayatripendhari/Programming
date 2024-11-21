//WAJP to identiy a given number is prime number or not.

import java.util.Scanner;
class P8A{
    public static boolean isPrime(int n){
        boolean res = false;
        int count =2;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count ++;
            }
        }
        if(count == 2){
            res= true;
        }
        else{
            res=false;
        }

        return res;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= s.nextInt();
        boolean res =isPrime(n);
        if(res){
            System.out.println("Given number is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}