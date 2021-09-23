import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2193 {
    static long recur(long[] dp, int n) {
        for(int i = 3; i<=n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]);
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N+2];
        dp[1] = 1;
        dp[2] = 1;

        if(N < 3) {
            System.out.println(1);
            return;
        }

        System.out.println(recur(dp, N));
    }
}
