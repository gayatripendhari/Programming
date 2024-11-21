//WAJP to print perfect numbers in range 1-100.
public class P12 {
    public static void main(String[] args) {
        for(int num=1;num<=100;num++){
            int sum =0;
            for(int f =2;f<=num/2;f++){
                sum=sum+f;

            }
            if(sum==num){
                System.out.println(num);
            }
            
        }
 
    }

}
