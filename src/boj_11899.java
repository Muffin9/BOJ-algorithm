import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(count == 0) {
                    result++;
                } else {
                    count--;
                }
            }
            else if(s.charAt(i) == '(') count++;
        }

        if(count != 0) {
            result += count;
        }
        System.out.println(result);

    }
}
