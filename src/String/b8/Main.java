package String.b8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(charDuplicate("lenhathoang"));
        System.out.println(charDuplicate("bananas"));
        System.out.println(charDuplicate("abaababaaabbbaba"));
    }

    public static String charDuplicate(String str){
        if(str == null || str.isEmpty()){
            return null;
        }

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){
            if(!(list.contains(str.charAt(i)))){
                list.add(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character item : list){
            sb.append(item);
        }
        return  sb.toString();

    }
}
