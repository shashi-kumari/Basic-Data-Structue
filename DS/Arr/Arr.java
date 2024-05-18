package DS.Arr;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int[] arr;
        int len;
        int n = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        len = sc.nextInt();
        arr = new int[len];
        do {
            System.out.println("\n```````````````````````````````````````````");
            System.out.println("`````````````````MENU``````````````````````");
            System.out.println("1:Add");
            System.out.println("2:Delete");
            System.out.println("3:Show");
            System.out.println("4:Clear");
            System.out.println("5:Change Size(you will loose existing data)");
            System.out.println("6:Exit");
            System.out.println("```````````````````````````````````````````");
            System.out.print("Enter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (n == len) {
                        System.out.print("Full Array:(\nPlease resize it");
                        continue;
                    }
                    arr[++n] = sc.nextInt();
                    break;
                case 2:
                    if (n < 0) {
                        System.out.print("Empty Array:(\nPlease try different option");
                        continue;
                    }
                    System.out.print("Enter Index:");
                    int i = sc.nextInt();

                    if (n < i) {
                        System.out.print("Invalid index");
                        continue;
                    }
                    while (i < n) {
                        arr[i] = arr[i + 1];
                        i++;
                    }
                    break;
                case 3:
                    System.out.print("[");
                    for (i = 0; i <= n; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.print("]");
                    break;
                case 4:
                    n = -1;
                    break;
                case 5:
                    System.out.print("Enter Array Size:");
                    len = sc.nextInt();
                    arr = new int[len];
                    n = -1;
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.print("Invalid Choice:(\nPlease try again");

            }
        } while (true);
    }
}
