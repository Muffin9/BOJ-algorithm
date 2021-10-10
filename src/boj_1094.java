import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int stick = 64;
        while(N > 0) {
            if(stick > N) stick /= 2;
            else {
                count++;
                N = N - stick;
            }
        }
        System.out.println(count);
    }
}
