import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_17103 {

    public static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] isNotPrime = new boolean[MAX + 1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i < MAX; i++) {
            if (isNotPrime[i] == false) {
                // 소수 찾으면
                for (int j = i + i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                    // 그 배수들 소수가 아니라 표시
                }
            }
        }

        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 3; j < value; j++) {
                // 표시된 소수 배열 3부터 돌면서
                if (isNotPrime[j] == false && j >= value-j) {
                    // 소수 찾고 j 가 m-j보다 클 경우만이라는 조건을 달아 중복을 방지한 다음
                    if (isNotPrime[value - j] == false) {
                        count++;
                        // 카운트 올린다
                    }
                }
            }
            System.out.println(count);
        }
    }
}
