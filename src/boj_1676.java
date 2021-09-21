import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1676 {
    public static void main(String[] args) throws IOException {
        // N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int zeroCount = 0;

        while (num >= 5) {
            zeroCount += num / 5;
            num /= 5;
        }
        System.out.println(zeroCount);

    }
}
