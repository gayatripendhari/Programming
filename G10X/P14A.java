//ArmStrong number 
public class P14A {
    public static void main(String[] args) {
        int num =153;
        int copy1 = num;
        int copy2 =num =0;
        int sum =0;
        int count =0;

        while(copy1!=0){
            count ++;
            copy1/=10;
        }

        while (copy2>0) {
            int d=copy2%10;
            int res =1;
            for(int i=1;i<=count;i++){
                res *= d;
            }
            sum += res;
            copy2/=10;
        }
        System.out.println(sum==num);
    }
}
