import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9095 {
    static int count = 0;
    static void go(int sum, int goal) {
        if(sum > goal) return;
        if(sum == goal) {
            count++;
            return;
        }
        for(int i = 1; i <= 3; i++) {
            // sum -> 누적값
            go(sum+i, goal);
        }
    }

    static int recur(int[] dp, int n){
        for(int i = 4; i<=n; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        // dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
//            int[] dp = new int[value + 3];
//            dp[1] = 1;
//            dp[2] = 2;
//            dp[3] = 4;
            go(0, value);
            System.out.println(count);
        }
    }
}
