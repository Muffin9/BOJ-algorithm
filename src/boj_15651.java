import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15651 {
    static int[] result;
    public static StringBuilder sb = new StringBuilder();

    static void dfs(int index, int N, int M) {
        if(index == M) {
            for(int j = 0; j < M; j++) {
                sb.append(result[j] + " ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i <= N; i++) {
            result[index] = i;
            dfs(index+1, N, M);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        result = new int[M];

        dfs(0, N, M);
        System.out.println(sb);
    }
}
