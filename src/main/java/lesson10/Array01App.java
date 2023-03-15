package lesson10;

import java.util.Scanner;

public class Array01App {
    public static void mainV1(String[] args) {
        double[] grades = new double[8];
        grades[0] = 100.0;
        grades[1] = 100.0;
        grades[2] = 100.0;
        grades[3] = 100.0;
        grades[4] = 222.2;
        grades[5] = 100.0;
        grades[6] = 100.0;
        grades[7] = 100.0;

        System.out.println(grades[4]);
        System.out.println(grades[5]);
    }

    public static void mainV2(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            int num = in.nextInt();
            nums[i] = num;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }

        }
    }
}