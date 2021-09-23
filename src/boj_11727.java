import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11727 {
    static int recur(int[]dp, int n) {
        for(int i = 2; i<=n; i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 1;
        dp[1] = 1;
        br.close();
        System.out.println(recur(dp, N));

    }
}
