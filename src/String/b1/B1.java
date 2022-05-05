package String.b1;

import java.util.HashMap;

public class B1 {
    public static void main(String[] args) {

    }

    public static void findDuplicateChar(String str){
        if (str == null || str.isEmpty()){
            System.out.println("NO");
            return;
        }

        String x = str;
        str = str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.compute(str.charAt(i), (k, v) -> v + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }

        if(map.isEmpty()){
            System.out.println("NO");
            return;
        }

        System.out.println("List duplicate of " + x + ": ");
        map.forEach((k, v) -> {
            if(v > 1){
                System.out.println(k);
            }
        });
    }
}
