import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15649 {

    static boolean[] flag = new boolean[10];
    static int[] result = new int[10];

    static void recur(int index, int N, int M) {
        if(index == M) {
            for(int j = 0; j < M; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= N; i++) {

            if(flag[i]) continue;
            flag[i] = true;
            result[index] = i;
            recur(index+1, N, M);
            flag[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        recur(0, N, M);
    }
}
