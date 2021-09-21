import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) return;

            int[] a = new int[2 * N + 1];
            int count = 0;
            for(int i = 1; i <= 2 * N; i++) {
                for(int j = 1; j <= N; j++) {
                    if (i * j > 2 * N) break;
                    a[ i * j ]++;
                }
            }
            for (int i = N + 1; i <= 2 * N; i++) {
                if (a[i] == 1)
                    count++;
            }
            System.out.println(count);
        }
    }
}
