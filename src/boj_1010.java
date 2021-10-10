import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1010 {
    static double factorial(double num) {
        if(num <= 1) return 1;
        else return num * factorial(num-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double num1 = Double.parseDouble(st.nextToken());
            double num2 = Double.parseDouble(st.nextToken());

            double result = (factorial(num2) / (factorial(num2 - num1) * factorial(num1)));
            System.out.printf("%.0f\n", result);
        }
    }
}
