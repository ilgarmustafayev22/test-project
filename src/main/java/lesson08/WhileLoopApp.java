package lesson08;

import java.util.Scanner;

public class WhileLoopApp {
    public static void main(String[] args) {
        // 1. Input
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        //2. Process
       /* int sum = 0;
        int prod = 1;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count++;
            sum += rem;
            prod *= rem;
        }

        // 3. Output
        System.out.printf("Sum of digits is: %d\n", sum);
        System.out.printf("Prod of digits is: %d\n", prod);
        System.out.printf("Count of digits is: %d\n", count);

        */


        while(true){
            if(num<0){
                System.out.println(num);
            }else{
                System.out.println(num);
                System.out.println(num%10);
                num/=10;
            }
        }

    }
}
