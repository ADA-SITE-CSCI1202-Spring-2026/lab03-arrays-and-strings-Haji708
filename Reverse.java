public class Reverse {
    public static void main(String[] args) {
        String str = "Çikimelu";
        String reversed = reverse(str);
        
        System.out.println(reversed);
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

}
