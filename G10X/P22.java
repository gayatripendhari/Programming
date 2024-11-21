/*
 * WAJP to convert a String based on the vslue of it's length
 * if the length of the string is even, convert all the characters present at even index of that string into Uppercase.
 * if the length of the string is odd, convert all the character present at odd index of that string into lowercase.
*/

public class P22 {
    public static void main(String[] args) {
        String  str = "java is a programming language. ";
        String temp ="";
        if(str.length()%2==0){
            for(int i=0;i<str.length();i++){
                if(i%2==0 && str.charAt(i)>='a' && str.charAt(i)<='z'){
                    temp += (char)(str.charAt(i)-32);
                }
                else{
                    temp += str.charAt(i);
                }
            }
        }
        else{
            for(int i=0;i<str.length();i++){
                if(i%2==1 && str.charAt(i)>='a' && str.charAt(i)<='z'){
                    temp += (char)(str.charAt(i)-32);
                }
                else{
                    temp += str.charAt(i);
                }
            }
        }
        System.out.println(temp);
    }
    
}
