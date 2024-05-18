package DS.Arr.Lv1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] arr;
        int len;
        int min=0;
        int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>arr[max])
                max=i;
            if(arr[i]<arr[min])
                min=i;
        }
        System.out.println(String.format("Array min is %d max is %d",arr[min],arr[max]));
    }
}
