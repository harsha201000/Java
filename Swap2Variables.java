public class Swap2Variables {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println("x: "+z);
        System.out.println("y: "+y);
    }
}