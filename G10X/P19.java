//WAJP to count number of digits in a given string.
public class P19 {
    public static void main(String[] args){
        String pass= "Remesh@1234";
        int count =0;
        for(int i=0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if(ch>='0' && ch<='9'){
                count++;
            }
        }
        System.out.println(count);

    }
}
