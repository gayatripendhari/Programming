//WAJP to idedentify given number is strong number or not.
public class P12A {
    public static void main(String [] agrs){
        int n =145;
        int copy = n;
        int sum=0;

        while(copy!=0){
            int d = copy %10;
            copy /=10;

            int fact =1;
            for(int i=1;i<=d;i++){
                fact *=i;
            }
            sum +=fact;
           // System.out.println(sum);

        }
        System.out.println(sum == n);
    }
}
