import java.util.Arrays;


public class Sort_and_Anagram {

    public static void main(String[] args) {
        String str1 = "agna";
        String str2 = "gana";

        String sorted1 = sortString(str1);
        String sorted2 = sortString(str2);

        System.out.println(sorted1.equals(sorted2));
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();   
        Arrays.sort(chars);                
        return new String(chars);         
    }
}
