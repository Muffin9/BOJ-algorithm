import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String arr = s.toUpperCase();
        int[] alpha = new int[26];
        for(int i = 0; i<arr.length(); i++) {
            int value = (int)arr.charAt(i)-65;
            alpha[value]++;
        }

        int max = 0;
        char result = '?';
        for(int i = 0; i<alpha.length; i++) {
            if(max < alpha[i]) {
                max = alpha[i];
                result = (char)(i+'A');
            }
            else if(max == alpha[i]){
                result = '?';
            }
        }

        System.out.println(result);
    }
}