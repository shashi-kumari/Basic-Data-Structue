package DS.Arr.Lv1;

import java.util.Scanner;

/**
 * A simple program to print subarray
 * with sum as given sum
 */
public class SubArrSum {
    public static void main(String[] args) {
        int[] arr;
        int len;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];
        boolean flag =true;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Sub-Array Sum:");
        int reqSum = sc.nextInt();
        for (int i = 0; i < len; i++) {
            int sum=arr[i];
            if(sum==reqSum){
                flag =false;
                System.out.println(String.format("Sum found at index %d",i+1));
            }
            for (int j = i+1; j < len; j++) {
                sum+=arr[j];
                if (sum>reqSum){
                    break;
                }
                else if(sum==reqSum){
                    flag =false;
                    System.out.println(String.format("Sum found from index %d to %d",i+1,j+1));
                }
            }

        }
        if (flag){
            System.out.println("Not found");
        }

    }
}
