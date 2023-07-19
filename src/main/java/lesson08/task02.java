package lesson08;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
      /*
        while (true) {
          System.out.println(num);
            if (num > 0) {
                System.out.println(num % 10);
                num /= 10;
            } else {
                break;
         }
    }
*/
        do {
            System.out.println(num);
            if (num > 0) {
                System.out.println(num % 10);
                num /= 10;
            }
        } while (num>0 );

    }
}
