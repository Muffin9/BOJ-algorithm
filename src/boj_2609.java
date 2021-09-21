import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int GCD = 1;
        int LCM = 1;

        while(true) {
            // num1, num2이 공통으로 나누어지는 수 구하기
            boolean isFlag = false;
            int value = 2;

            for(int i = value; i <= num1; i++) {
                if(num1 % i == 0 && num2 % i == 0) {
                    isFlag = true;
                    value = i;
                    break;
                }
            }

            if(isFlag) {
                num1 = num1 / value;
                num2 = num2 / value;
                GCD *= value;
            } else break;
        }

        LCM = GCD * num1 * num2;
        System.out.println(GCD);
        System.out.println(LCM);
        br.close();
    }
}
