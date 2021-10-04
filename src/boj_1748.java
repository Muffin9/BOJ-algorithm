import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int count = 1;
        int temp = 10;

        for(int i = 1; i <= N; i++) {
            if(i == temp) {
                temp *= 10;
                count += 1;
            }
            result += count;
        }
        System.out.println(result);
    }
}
