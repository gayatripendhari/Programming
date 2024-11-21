/*
 * Reverse a String in such a way that we reverse all the characters but without changing the position
 * of any special symbol of that string.
*/
public class P23 {
    public static void main(String[] args) {
        String str = "H@el#lo$";
        char[] arr = str.toCharArray();
        int start =0;
        int end = arr.length -1;

    
        while (start<end) {
            if(Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])){
                char temp = arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if(Character.isAlphabetic(arr[start])){
                end--;
            }
            else{
                start++;
            }

            
        }
        String res = new String(arr);
        System.out.println(res);
    }
    
}
