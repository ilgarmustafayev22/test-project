package lesson07;

import java.util.Scanner;

public class LoppsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int last = num % 10;
        int second = (num / 10) % 10;
        int third = (num / 100) % 10;
        int first = (num / 1000) % 10;
        int sum = last + second + third + first;
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i < 4; i++) {
            int remainder = num % 10; //4, 3, 2
            num = num / 10; //123, 12, 1
            sum = sum + remainder; //4, 7, 9
        }
        System.out.println(sum);

    }
}
