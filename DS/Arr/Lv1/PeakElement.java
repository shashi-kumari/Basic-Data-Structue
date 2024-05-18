package DS.Arr.Lv1;

import java.util.Scanner;

/**
 * Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
 *
 * Note: If the array is increasing then just print the last element will be the maximum value.
 */
public class PeakElement {
    public static void main(String[] args) {
        int[] arr;
        int len;
        int peak;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        peak = 0;
        for (int i = 1; i < len; i++) {
            if((arr[i]>arr[i-1])&&(i==(len-1)||arr[i]>arr[i+1])){
                System.out.println(String.format("Array Peak at index %d with value %d",(i+1),arr[i]));
                //for highest peak
                if(arr[peak]<arr[i]){
                    peak=i;
                }

            }
        }
        System.out.println(String.format("Array Highest Peak at index %d with value %d",(peak+1),arr[peak]));

    }
}
