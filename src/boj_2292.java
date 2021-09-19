import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int save = 1;
        while(true) {
            save = save + (6 * count);
            if(save < N) count++;
            else {
                System.out.println(count+1);
                return;
            }
        }
    }
}
