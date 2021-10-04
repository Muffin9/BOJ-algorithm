import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int count = 0;
        String str = String.valueOf(N);

        String newN = "";

        for(int i = 0; i<str.length(); i++) {
            if(i == str.length()-1 || i == str.length()-2) {
                newN += "0";
            } else {
                newN += str.charAt(i);
            }
        }

        while(true) {
            int num = Integer.parseInt(newN) + count;
            if(num % F == 0) {
                break;
            }
            count++;
        }

        String result = count < 10 ? "0" + count : String.valueOf(count);
        System.out.println(result);
    }
}
