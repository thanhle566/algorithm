package array;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int arrayLength = sc.nextInt();
            int numberRotation = sc.nextInt();

            int[] arr = new int[arrayLength];

//            use StringBuffer for high performance

            StringBuffer s = new StringBuffer();
            for (int i = 0; i < arrayLength; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = numberRotation; i < arrayLength + numberRotation; i++) {
                s.append(arr[i%arrayLength] + " ");
            }
            System.out.println(s);
        }
    }

}
