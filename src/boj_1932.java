import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];
        int max  = 0;
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp = arr.clone();

        for(int i = 1; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0) dp[i][j] = arr[i-1][j] + dp[i][j];
                else if(j == i) dp[i][j] = arr[i-1][j-1] + dp[i][j];
                else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + dp[i][j];
                }
            }
        }

        // 마지막행에서 최댓값을 가져오면 된다.
        for(int i = 0; i < N;i++) {
            if(dp[N-1][i] > max) {
                max = dp[N-1][i];
            }
        }

        System.out.println(max);

    }
}
