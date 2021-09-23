import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1699 {

    public static int d[];
    // https://squareyun.tistory.com/15
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // currentMaxCount 구하기
        d = new int[N+1];

        System.out.println(d[N]);

    }
}
