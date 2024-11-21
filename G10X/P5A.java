//WAJP to find out n^p
import java.util.Scanner;
public class P5A {
    public static int power(int n,int p){
        int res =1;
        for(int i=0;i<p;i++){
            res *= n;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();
        System.out.println("Enter the power you want: ");
        int p =s.nextInt();
        System.out.print(p +" th power  of a given number "+n +" is= ");
        System.out.print(power(n,p));
    }
    
}
