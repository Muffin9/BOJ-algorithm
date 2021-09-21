import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9613 {
    public static int GCD(int num1, int num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[M];
            int index = 0;
            while(st.hasMoreTokens()) {
                arr[index] = Integer.parseInt(st.nextToken());
                index++;
            }

            long sum = 0;
            for(int j = 0; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    sum += GCD(arr[j], arr[k]);
                }
            }
            sb.append(sum + "\n");
        }

        br.close();
        System.out.println(sb);
    }
}
