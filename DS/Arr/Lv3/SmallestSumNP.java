package DS.Arr.Lv3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of positive numbers, find the smallest positive integer value that cannot be represented as the sum of elements of any subset of a given set. 
 */
public class SmallestSumNP {
    public static void main(String[] args) {
        int[] arr;
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = getsmallest(arr, len);
        System.out.println(smallest);
    }

    private static int getsmallest(int[] arr, int len) {
        int res = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > res) {
                return res;
            } else {
                res += arr[i];
            }
        }
        return res;
    }


}
