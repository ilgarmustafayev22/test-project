package lesson08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /*  int num = scan.nextInt();


        int count = 0;
        while (num > 0) { //1234, 123, 12, 1
            num /= 10;//123, 12, 1, 0
            count++;//1,2,3,4
        }
        System.out.println(count);*/

        int a = 4;
        int b = 7;
        int c = b%a;
        System.out.println(c);
    }
}
