//WAJP to check whether a given number is ArmStrong Number.
/*
 * ArmStrong Number
 * 153 
 * No of digits = 3
 * sum = 1^3 + 5^3 + 3^3
*/
public class P14 {
public static void main(String[] args) {
    int num=153;
    int copy =num;
    int copy2 = num;
    int count = 0;
    int sum =0;

    while (num>0) {
        count++;
        num/=10;
    }
    while (copy>0) {
        int d = copy%10;
        int res =1;
        for(int i =1;i<=count;i++){
            res *=d;
        }
        sum +=res;
        copy /=10;
    }
    System.out.println(sum==copy2);
}    
}
