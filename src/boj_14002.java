import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_14002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        Stack stack = new Stack();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int result = 1;

        int index = 0;
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        for(int i = 0; i < N; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }

            }
            result = Math.max(result, dp[i]);
        }


        int length = result;

        for(int i = N-1; i >= 0; i--){
            // 현재 찾는 길이와 같은 경우
            if(length == dp[i]) {
                // stack에 실제 값을 push한다.
                stack.push(arr[i]);
                // 찾는 길이를 찾았으므로 -1을 해주어
                // 다음에 찾을 길이를 설정해준다.
                length--;
            }
        }

        System.out.println(stack.size());
        for(int i = stack.size()-1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }


    }
}
