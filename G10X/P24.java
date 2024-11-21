/*
 * WAJP to check wether a given string is pangram.
 * Note: Pangram 
 * The String which contain all alphabets from a to z whether they are in 
 * uppercase or lowercase atleast once in any case .
*/
public class P24 {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        str= str.toLowerCase();
        int count =0;
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count==26);
    }
    
}
