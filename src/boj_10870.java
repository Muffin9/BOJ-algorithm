import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10870 {
    public static int fibo(int num) {
        if(num == 0) return 0;
        else if(num == 1 || num == 2) return 1;
        int sum = fibo(num-1) + fibo(num-2);
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = fibo(N);
        System.out.println(result);

    }
}
