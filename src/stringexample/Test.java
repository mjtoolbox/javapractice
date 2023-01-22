package stringexample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("So %s. How old are you? ", name);
        int age = scanner.nextInt();

        System.out.printf("Cool! %d is a good age to start programming.", age);

        scanner.close();
//        String s = "Hello"; // Initialized
//        String s1 = new String("Hello"); // Instantiated
//        String s2 = "Hello";
//        String s3 = new String("Hello"); // Instantiated
//        System.out.println(s1 == s3);
//        StringBuffer sb = new StringBuffer();
//        sb.
    }
}