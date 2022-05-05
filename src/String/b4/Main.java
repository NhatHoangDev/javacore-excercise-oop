package String.b4;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse1("23456"));

    }

    public static void reverse(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static String reverse1(String str){
        if(str.length() < 2){
            return str;
        }

        return reverse1(str.substring(1)) + str.charAt(0);
    }
}
