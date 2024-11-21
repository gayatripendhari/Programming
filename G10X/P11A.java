//WAJP to  check a given number is perfect number or not
/*
 * 6= 1+2+3
*/
import java.util.Scanner;
public class P11A {
    public static Boolean isPerfectNum(int n){
        boolean res =false;
        
        int sum =0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum==n){
            res = true;
        }
        else{
            res =false;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();
        boolean res = isPerfectNum(n);
        if(res){
            System.out.println(n+" is a perfect number. ");
        }
        else{
            System.out.println(n+" is not a perfect number.");
        }
    }

    
}
