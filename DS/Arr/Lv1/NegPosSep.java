package DS.Arr.Lv1;

import java.util.Scanner;

/**
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.
 *
 * Note: Order of elements is not important here.
 */
public class NegPosSep {
    public static void main(String[] args) {
        int[] arr;
        int len;
        int curr =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            if(arr[i]<0){
                int temp =arr[i];
                arr[i]=arr[curr];
                arr[curr]=temp;
                curr++;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
