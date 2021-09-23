import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N + 1];
        int[] result = new int[N + 1];
        int index = 1;
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        for(int i = 1; i <=N; i++) {
            for(int j = 1; j <= i; j++) {
                result[i] = Math.max(result[i], result[i - j] + arr[j]);
            }
        }

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        br.close();
        System.out.println(result[N]);

    }
}
