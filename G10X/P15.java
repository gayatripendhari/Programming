//WAJP to check whether a given number is neon number.
/*
 * Neon NUmner:
 * n = 9
 * power = n*n
 * n == sum of digits of power
 * 
*/
public class P15 {
    public static void main(String[] args) {
        int n =9;
        int power = n*n;
        int sum=0;
        while(power !=0){
            int d = power % 10;
            sum += d; 
            power/=10;
        }
        if(sum==n){
            System.out.println("It's neon number");
        }
        else{
            System.out.println("It isn't neon number. ");
        }
    }
    
}
