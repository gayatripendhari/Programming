import java.util.Arrays;
//WAJP to identify whether the given to Strings are anagram of each other or not.
public class P26 {
    public static void main(String[] args) {
        String s1 = "meta";
        String s2 = "epma";
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);
        if(arr1.length==arr2.length){
            if(Arrays.equals(arr1, arr2)){
                System.out.println("it's an anagram");
            }
            else{
                System.out.println("it's not an anagram");
            }
        }
        else{
            System.out.println("Not an anagram");
        }
    }
    
}
