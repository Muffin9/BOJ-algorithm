import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int [] modeCheck = new int[8001];
        int arithmetic = 0;
        int middle = 0;
        int mode = 0;
        int range = 0;
        int sum = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            modeCheck[arr[i]+4000]++;
        }

        Arrays.sort(arr);

        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }


        arithmetic = (int)Math.round((double)sum / N);
        middle = arr[arr.length/2];
        range = max - min;
        System.out.println(arithmetic);
        System.out.println(middle);
        System.out.println(range);


    }
}
