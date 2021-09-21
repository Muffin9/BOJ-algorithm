import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1929 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int num1 = Integer.parseInt(st.nextToken());
//        int num2 = Integer.parseInt(st.nextToken());
//
//        for(int i = num1; i <= num2; i++) {
//            boolean isChecked = false;
//            if(i == 2) {
//                System.out.println(i);
//                continue;
//            }
//
//            for(int j = 2; j < i; j++) {
//                if(i % j == 0) {
//                    break;
//                }
//
//                if(j == i - 1) {
//                    isChecked = true;
//                }
//            }
//
//            if(isChecked) {
//                System.out.println(i);
//            }
//        }
//
        // 시간초과 뜸 -> 에라토스테네스의 체 방식 사용
        // 2부터 자기자신을 제외한 배수들을 n까지 제외
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int [] a = new int[num2+1];

        for(int i=0; i<a.length; i++) {
            a[1] = 0;
            a[i] = 1;
        }

        for(int i=2; i<=num2; i++) {
            for(int j=2; i*j <=num2; j++) {
                a[i*j] = 0;
            }
        }

        for(int i=num1; i<=num2; i++) {
            if(a[i] != 0) {
                System.out.printf("%d ", i);
            }
        }

        br.close();

    }
}
