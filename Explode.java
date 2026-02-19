public class Explode {
    public static void main(String[] args) {
        String str = "Baku";
        String exp = fun(str);
        
        System.out.println(exp);
    }

    public static String fun(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for(int j = 0 ;j<=i ;j++){
                sb.append(str.charAt(j));
            }
        }

        return sb.toString();
    }

}
