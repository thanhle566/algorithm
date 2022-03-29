package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverseGroup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        while (testCase-- > 0) {
            String inputLine2[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine2[0]);
            int k = Integer.parseInt(inputLine2[1]);
            int[] arr = new int[n];
//            use readLine for high speed
            String inputLine3[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine3[i]);
            }
            StringBuffer stringBuffer = new StringBuffer();
            //check
            for(int i =0 ; i < n/k ; i++){
                for(int j = (i+1)*k-1; j >= i*k; j --){
                    stringBuffer.append(arr[j] + " ");
                }
            }
            for(int i = 0; i < n%k; i ++){
                stringBuffer.append(arr[n-1-i] + " ");
            }
            System.out.println(stringBuffer);
        }
    }

}
