package b10;

public class Main {
    public static void main(String[] args) {
        VanBan vanBan = new VanBan("   ad f k l has dlfkahdsfk ah   dak     nhathoang    ");
        int x = vanBan.count(vanBan.getVanBan());
        int y = vanBan.countA(vanBan.getVanBan());
        vanBan.regex(vanBan.getVanBan());
        System.out.println(x);
        System.out.println(y);

    }
}
