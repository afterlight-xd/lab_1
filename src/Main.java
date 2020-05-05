public class Main {
    public static void main(String[] args) {
        GamingWirelessMice g305 = new GamingWirelessMice("G305", 3099, "USB 3.0", "Logitech",false,"none");
        Display xl2411p = new Display("XL2411P", 15000, "Display Port", "BenQ", "16:9", 24,144,"1920x1080","IPS");

        System.out.println(g305.toString());
        System.out.println(xl2411p.toString());
    }
}
