package String.b7;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkStringPalindrome("Aba"));
        System.out.println(checkStringPalindrome("abc"));
    }

    public static boolean checkStringPalindrome(String str){
        if(str == null || str.isEmpty()){
            return  false;
        }

        String x = str.toLowerCase();
        StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        for (int i = 0; i < x.length(); i++){
            if(x.charAt(i) != sb.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
