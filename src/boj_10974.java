import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10974 {
    static boolean[] flag;
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static void dfs(int index, int N) {
        if(index == N) {
            for(int i = 0; i < N; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
        }

        for(int i = 1; i <= N; i++) {
            if(flag[i]) continue;
            flag[i] = true;
            result[index] = i;
            dfs(index+1, N);
            flag[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        flag = new boolean[N+1];
        result = new int[N+1];
        dfs(0, N);
        System.out.println(sb);

    }
}
