//WAJP to find the factors of given numbers
import java.util.Scanner;
public class P6A {
    public static void factors(int n){
        int fact=0;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fact =i;
                //System.out.println(fact);
                count ++;
    
            }
        }
        System.out.println(count);
    
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        System.out.println("Count of Facters of a given number "+n+"is= ");
        factors(n);
    }
    
}
