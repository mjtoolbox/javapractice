package exceptions;

public class Test {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 10;
            int z = y / x;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
