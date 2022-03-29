package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringBuffer stringBuffer = new StringBuffer();
            int[] arr = new int[n];
//            use readLine for high speed
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            //check
            for(int i = n -1; i >= 0; i--){
                stringBuffer.append(arr[i] + " ");
            }
            System.out.println(stringBuffer);
        }
    }

}
