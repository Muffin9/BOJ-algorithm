import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15652 {
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    static void dfs(int index, int start, int N, int M) {
        if(index == M) {
            for(int i = 0; i < M; i++) {
                sb.append(result[i] + " ");
            }
            sb.append('\n');
            return;
        }

        for(int i = start; i <= N; i++) {
            result[index] = i;
            dfs(index+1, i, N, M);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        result = new int[M];

        dfs(0, 1,  N, M);
        System.out.println(sb);

    }
}
