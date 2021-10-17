import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11687 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = 0;
        int M = Integer.parseInt(br.readLine());
        int N = 0;

        while(true) {
            int count = 0;
            start += 5;
            count += start / 5;
            count += start / 25;
            N = start;
            if(count == M) {
                System.out.println(N);
                return;
            }
        }

    }
}
