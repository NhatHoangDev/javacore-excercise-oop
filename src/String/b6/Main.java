package String.b6;


public class Main {
    public static void main(String[] args) {
        //java
        count("12345");
        String x = "    ";
        x = x.trim();
        String[] a = x.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--){
            sb.append(a[i]).append(" ");
        }
        sb.toString().trim();
        System.out.println(sb);

    }

    public static void count(String str){
        if(str == null || str.isEmpty()){
            System.out.println("Khong co nguyen am, phu am");
            return;
        }

        int x = 0;
        //char[] chars = str.toCharArray();
        //int y = Integer.parseInt(str);

        for (int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case 'u':
                case 'e':
                case 'o':
                case 'a':
                case 'i':
                        x++;
                        break;
            }
        }
        System.out.println(x);
    }
}
