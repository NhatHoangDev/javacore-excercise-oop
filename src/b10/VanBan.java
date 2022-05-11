package b10;

import java.util.ArrayList;
import java.util.List;

public class VanBan {
    private String vanBan;

    public VanBan() {
    }

    public VanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public int count(String vanBan){
        StringBuilder sb = new StringBuilder(vanBan);
        String[] x = sb.toString().split(" ");
        int count = 0;
        for (String item : x) {
            count++;
        }
        return count;
    }

    public int countA(String vanBan){
        if(vanBan == null || vanBan.isEmpty()){
            return 0;
        }
        String a = vanBan.toLowerCase().trim();
        int count = 0;
        char[] x = a.toCharArray();
        for (int i = 0; i < x.length; i++){
            if(vanBan.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }

    public void regex(String vanBan){
        List<String> x = new ArrayList<>();
        String[] y = vanBan.split(" ");
        for (String item : y){
            if (item.equals(" ")){
                return;
            }
            x.add(item);
        }
        for (String item : x) {
            System.out.println(item);
        }

    }
}
