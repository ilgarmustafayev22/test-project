package lesson06;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
      /*  System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.isEmpty());
        System.out.println(word.lastIndexOf(word));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(4));
        System.out.println(word.trim());
       */
        if(num > 12 || num <= 0){
            System.out.println("This operation is not valid!");
        } else if (num<=3) {
            System.out.println("Winter");
        }else if(num>4 && num<=6){
            System.out.println("Spring");
        }else if(num > 6 && num <=9){
            System.out.println("Summer");
        }else{
            System.out.println("Autumn");
        }
    }
}


