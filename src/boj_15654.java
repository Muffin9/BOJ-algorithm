import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_15654 {
    static int[] result;
    static boolean[] flag;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int index, int[] arr, int M) {
        if(index == M) {
            for(int i = 0; i < M; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
        }

        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) continue;
            flag[i] = true;
            result[index] = arr[i];
            dfs(index+1, arr, M);
            flag[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        result = new int[N];
        flag = new boolean[N];

        dfs(0, arr, M);
        System.out.println(sb);

    }
}
