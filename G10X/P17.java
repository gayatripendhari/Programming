//WAJP to count number of digits in a give number . If the count is odd reverse the given number. If  the count is even then swap first half of number with the second half.

/*
 * ex n =1234
*/
import java.util.Scanner;
public class P17 {

    public static int count(int n){
        int copy = n;
        int count=0;
        while (copy!=0) {
            count++;
            copy /= 10;
        }
        return count;
    } 

    public static int reverse(int n){
        int copy1 = n;
        int rev=0;
        while (copy1!=0) {
            int d = copy1%10;
            copy1/=10;
            rev = rev*10 + d; 
        }
        return rev;
    }

    public static int halfSwap(int n){
        int copy2 = n;
        int c = count(n);
        int result =0;
        int n1 = 0;
        int rev =0;
        int rev2 =0;
        while ( n!=0) {
            if(n1 >= c/2){
                int d = copy2%10;
                copy2/=10;
                rev = rev*10 +d ;
                result = rev;
            }
            
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n =s.nextInt();

        int c = count(n);

         if(c%2==0){
            System.out.println("Swapping first half digits with  last one is: "+halfSwap(n));
         }
         else{
            System.out.println("Reverse of a number is: "+ reverse(n));
         }
        
    }
    
}
