package task;

import java.util.Optional;
import java.util.Scanner;

public class TaskApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[100];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        Optional<Integer> num1 = findNum(num, nums);
        System.out.println(num1);

    }


    private static Optional<Integer> findNum(int num, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int o = 0;

        while (start <= end) {
            o++;
            int mid = (start + end) / 2;

            if (num < nums[mid]) {
                end = mid - 1;
            } else if (num > nums[mid]) {
                start = mid + 1;
            } else {
                System.out.println("O(" + o + ")");
                return Optional.of(mid + 1);
            }
        }
        return Optional.of(-(start + 1));
    }

}





