package lesson08;

import java.util.Scanner;

public class WhileLoopApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int i = 0;
        while (i < 7) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + remainder;
            i++;
        }
        System.out.println(sum);
    }
}
