//WAJP to check a given number is perfect number 
/*
 * Perfect numbers
 * 1. 6 = 1+2+3
 * 2. 1+2+4+7+14
*/
public class P11 {
    public static Boolean factor(int n){
        int sum =0;
        boolean res = false;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            res=true;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=6;
       // System.out.println(factor(n));
        if(factor(n)){
            System.out.println("It's Perfect Number");
        }
        else{
            System.out.println("It's not perfect number.");
        }
    }
}
