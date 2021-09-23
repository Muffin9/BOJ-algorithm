import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[N];
        int[] dp = new int[N];
        int result = 1;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for(int i = 0; i<arr.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
               // ?
            }
        }
        System.out.println(result);

    }
}
