//WAJP to idenetify whether a given number is armstrong number or not.
public class P25 {
    public static void main(String[] args) {
        int n = 153;
        int count =0;
        int copy = n;
        int copy2 =n;
        while(n!=0){
            count++;
            n/=10;
        }
       // System.out.println(count);

            int sum =0;
            while(copy!=0){
                int d =copy%10;
                copy/=10;
                int p=1;
                for(int i=1;i<=count;i++)
                {
                     p *= d;
                     //System.out.println(p);
                
                }
                sum+=p;      
        }
        System.out.println(sum==copy2);
    }
    
}
