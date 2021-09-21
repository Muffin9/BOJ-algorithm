import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();
        for(int i = 0; i<str.length(); i++) {
            int value = str.charAt(i) - 97;
            arr[value] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
        br.close();
    }
}
