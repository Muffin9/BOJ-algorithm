import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0; // 개수
        int n = 0; // 행 번호

        br.close();
        
        while(true) {
            n++;
            cnt += n;
            if(cnt >= num) {
                if(n % 2 == 0) {
                    System.out.println(num-cnt+n+"/"+(cnt-num+1));
                } else {
                    System.out.println((cnt-num+1) + "/" + (num-cnt+n));
                }
                return;
            }
        }
    }
}
