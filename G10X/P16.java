//WAJP to check whether a given number is disarium number.

/*
Disarium number
 * n =175
 * sum = 1^1 + 7^2 + 5^3
 * n ==sum 
*/
public class P16 {
    public static void main(String[] args) {
        int n =175;
        int copy=n;
        int copy1 =n;
        int count = 0;
        int sum=0;
        
        while (copy!=0) {
            count++;
            copy/=10;
        }
        int temp =0;
        int d=0;
        while (n!=0) {
            int sq=1;
            d= n%10;
            n = n/10;
            
            for(int i=1;i<=count;i++){
                sq*=d;
            }
            temp = sq;
            count--;
            sum +=temp;
            
        }

        if(sum==copy1){
            System.out.println("It's a disarium number");
        }
        else{
            System.out.println("It is not disarium number");
        }
    }
}
