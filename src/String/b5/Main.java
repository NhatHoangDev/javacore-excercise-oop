package String.b5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.*/
    public static void main(String[] args) {

        System.out.println(isChar("12agsa"));
        System.out.println(isChar("assg"));
        System.out.println(isChar2("asg23"));
        System.out.println(isChar2("asg"));

    }

    public static boolean isChar(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        for (int i = 0; i< str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isChar2(String str){
        if(str == null || str.isEmpty()){
            return false;
        }

        Pattern pattern = Pattern.compile("\\D*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
