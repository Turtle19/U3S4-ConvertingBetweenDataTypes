public class Casting01 {
    public static void main(String[] args) {
        // byte random = 128;
        short random = 128;
        byte random1;
        byte random2 = 127;
        random1 = (byte) random;
        System.out.println(random1);
        System.out.println(random2 + 1);
        System.out.println(random2 + 1 + 1);
    }
}
