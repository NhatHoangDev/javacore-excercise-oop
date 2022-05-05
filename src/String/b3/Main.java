package String.b3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //nhathoang
        firstChar("nhathoang");
        firstChar("aabasktt");
    }

    public static void firstChar(String str){
        if(str == null || str.isEmpty()){
            System.out.println("NO");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.compute(str.charAt(i), (k, v) -> v + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (map.get(str.charAt(i)) == 1) {
//                System.out.println(str.charAt(i));
//                return;
//            }
//        }
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if(item.getValue() == 1){
                System.out.println(item.getKey());
                return;
            }
        }

        System.out.println("NO");


    }
}
