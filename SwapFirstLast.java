import java.util.Arrays;


public class SwapFirstLast {

    public static void main(String[] args) {
        String str1 = "This is PP2 Fall 2021";

        String sorted1 = sortString(str1);
        

        System.out.println(sorted1);
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        int first=0;   
        for(int last=0 ; last<str.length();last++){
            if (last == str.length()-1 || chars[last]==' '){
                char temp= chars[first];
                chars[first] = chars[last-1];
                chars[last-1] = temp;
                first = last+1;

            }
            

        }               
        return new String(chars);         
    }
}
