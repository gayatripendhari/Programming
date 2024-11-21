//WAJP to calculate factorial of a given number n
import java.util.Scanner;
public class P4A {
    public static int factorial(int n){
        int res =1;
        for(int i=1;i<=n;i++){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Factorial of a given number is: "+factorial(n));
    }
}
