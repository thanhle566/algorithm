package array;

import java.util.Scanner;

public class ArrayBalance {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int sumL = 0, sumR = 0;
            for(int i = 0; i < n/2; i++){
                sumL += arr[i];
            }
            for(int i = n/2; i < n; i++){
                sumR += arr[i];
            }
            System.out.println(Math.abs(sumR - sumL));

        }
    }


}
