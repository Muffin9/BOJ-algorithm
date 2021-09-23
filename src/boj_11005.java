import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        String result = "";
        while(N != 0) {
            if(N % B >= 10) result += (char) (N % B - 10 + 'A');
            // ASCII    '0' : 48 , 'A' : 65, 'a' :  97
            else result += (char)(N % B + '0');
            N /= B;
        }

        String reverse = "";
        for(int i = result.length()-1; i>=0; i--) {
            reverse = reverse + result.charAt(i);
        }
        br.close();
        System.out.println(reverse);
    }
}
