    //WAJP to identify strong number
public class P13 {
    public static void main(String[] args) {
        int num=145;
        int copy = num;
        int sum =0;

        while(num!=0){
            int d=num%10;
            int fact=1;

            for(int i=1;i<=d;i++){
                    fact *= i;
            }
            sum += fact;
            num /= 10; 

        }
        System.out.println(sum==copy);
    }

}
