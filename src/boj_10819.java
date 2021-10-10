import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 10 4 20 1 15 8
// 6 + 16 + 19 + 14 + 7 -> 62
public class boj_10819 {
    static boolean[] flag;
    static int[] result;
    static int max = 0;
    static void dfs(int index, int[] arr, int N) {
        if(index == N) {
            int sum = 0;
            for(int i = 0; i < N-1; i++) {
                sum += Math.abs(result[i+1]-result[i]);
                max = Math.max(max, sum);
            }
        }

        for(int i = 0; i<N; i++) {
            if(flag[i]) continue;
            flag[i] = true;
            result[index] = arr[i];
            dfs(index+1, arr, N);
            flag[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        flag = new boolean[N];
        result = new int[N];
        dfs(0, arr, N);
        System.out.println(max);
    }
}
