package array;

import java.util.Scanner;

public class ArrayQuickSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            quickSort(arr, 0, n - 1);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }


    static int partion(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[last];
        arr[last] = temp;
        return i + 1;
    }

    static void quickSort(int arr[], int first, int last) {
        if (first < last) {
            int pi = partion(arr, first, last);
            quickSort(arr, first, pi - 1);
            quickSort(arr, pi + 1, last);
        }
    }

}
