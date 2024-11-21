
//WAJP to check wether a  given string is  palindrome.
public class P20 {
    public static void main(String[] args) {
        String s = "NAYAN";
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println("Original String is: "+s);
        System.out.println("Reverse String is: "+rev);
        if(s.equals(rev)){
            System.out.println("Yes.It is palindrome! ");
        }
        else{
            System.out.println("It is not palindrome!");
        }
    }
}
