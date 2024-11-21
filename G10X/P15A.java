//WAJP to check whether a given number is neon number or not.
public class P15A {
    public static void main(String[] args){
        int n=9;
        int power =n*n;
        int sum = 0;

        while(power!=0){
            int d= power%10;
            sum += d;
            power /=10;

        }
        if(sum==n){
            System.out.println("It a neon number");
        }
        else{
            System.out.println("It is not a neon number.");
        }
    }
    
}
