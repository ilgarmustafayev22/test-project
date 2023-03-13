package lesson09;

import java.util.Scanner;

public class EolympApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b) {
            System.out.print(b + " " + a);
        } else {
            System.out.print(a + " " + b);
        }


    }
}