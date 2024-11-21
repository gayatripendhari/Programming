//WAJP to print prime numbers from 1 to 100
public class P10A {
    public static void main(String[] args) {
        int count =2;
        for(int i =2;i<=100;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count ++;

                }
            }
            if(count==2){
                System.out.println(i);
            }
            count =2;
        }
    }
}
