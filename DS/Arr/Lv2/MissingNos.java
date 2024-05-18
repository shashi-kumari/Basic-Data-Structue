package DS.Arr.Lv2;

import java.util.Scanner;

/**
 * Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
 *
 * Note: There are no duplicates in the list.
 */
public class MissingNos {
    public static void main(String[] args) {
        int[] arr;
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];

        for (int i = 0; i < len-1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= len; i++) {
            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (i==arr[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(i+" not found");
                System.exit(0);
            }
        }
    }
}
