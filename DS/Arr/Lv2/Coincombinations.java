package DS.Arr.Lv2;

import java.util.Scanner;

/**
 * Given an integer array of coins[ ] of size N representing different types of denominations and an integer sum, the task is to count all combinations of coins to make a given value sum.
 *
 * Note: Assume that you have an infinite supply of each type of coin.
 *
 * Examples:
 *
 *     Input: sum = 4, coins[] = {1,2,3},
 *     Output: 4
 *     Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.
 */
public class Coincombinations {
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

        System.out.print("Enter Sum:");
        int sum = sc.nextInt();
        int count = count(arr,len,sum);
        System.out.println(count);
    }

    private static int count(int coins[], int n, int sum)
    {

        if (sum == 0)
            return 1;
        if (sum < 0)
            return 0;

        if (n <= 0)
            return 0;
        return count(coins, n - 1, sum)
                + count(coins, n, sum - coins[n - 1]);
    }
}
