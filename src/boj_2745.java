import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int num = 0;
        int sum = 0;

        for(int i = 0; i<N.length(); i++) {
            if (N.charAt(i) >= 65) num = N.charAt(i) - 55;
            else num = N.charAt(i) - '0';
            int value = (int) Math.pow(B, N.length()-i-1);
            sum += value * num;
        }

        System.out.println(sum);
    }
}