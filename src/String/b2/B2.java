package String.b2;

public class B2 {
    public static void main(String[] args) {
       boolean x = check("123456", "wedcba");
       boolean x1 = check2("abcdew", "wedcba");
        System.out.println(x);
        System.out.println(x1);
    }

    public static boolean check(String str1, String str2){
        if (str1 == null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder(str1);
        return str2.equals(sb.reverse().toString());
    }

    public static boolean check2(String str1, String str2){
        if (str1 == null || str2 == null){
            return false;
        }

        if(str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(str1.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

}
