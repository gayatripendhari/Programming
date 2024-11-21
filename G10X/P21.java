//WAJP to check whether the two given strings are anagram of each other.
/*
 * Anagram String
 * S1 = "silent"
 * s2= "listen"
 * s1.length() == s2.length()
 * char in s1 == char in s2
 * 
*/
import java.util.Arrays;
public class P21 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2= "listen";

        if(str1.length() == str2.length()){
            char[] arr1= str1.toCharArray();
            Arrays.sort(arr1);
            char[] arr2= str2.toCharArray();
            Arrays.sort(arr2);

            System.out.println(Arrays.equals(arr1,arr2));

        }
        else{
            System.out.println(false);
        }

        
    }
}
