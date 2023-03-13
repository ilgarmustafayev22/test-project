package lesson09;

import java.util.Scanner;

public class EolympApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a / 10;
        int c = a % 10;
        System.out.println(b + " " + c);

    }
}
