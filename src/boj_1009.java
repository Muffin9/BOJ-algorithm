import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1009 {

    public static int customPower(int a, int b) {
        int res = 1;

        for(int i=0; i<b; i++) {

            if(res > 10)
                res %= 10;

            res *= a;
        }

        return res % 10;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int result = customPower(n1, n2);

            if(result == 0) System.out.println("10");
            else System.out.println(result);
        }

    }
}
