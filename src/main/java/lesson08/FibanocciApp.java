package lesson08;

import java.util.Scanner;

public class FibanocciApp {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        while(a<100){
//            System.out.println(a);
//            System.out.println(b);
//            a=b+a;
//            b=a+b;

        //}

//        int a=0;
//        int b=1;
//         while(a<=50){
//             System.out.println(a);
//             int c=a;
//             a=b;
//             b=a+c;
        //       }
        /*Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a=num;
        int new_num=0;
        while (num > 0) {
            int rem=num%10;
            num/=10;
            new_num=new_num*10+rem;
        }
        if(new_num==a) System.out.println(a+" is polyndrom");
        else System.out.println("not polyndrom");*/

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int ebob=1;
        for(int i=a;i>1;i--){
            if(a%i==0 && b%i==0){
                ebob=i;
                break;
            }
        }
        System.out.println(ebob);







    }
}

