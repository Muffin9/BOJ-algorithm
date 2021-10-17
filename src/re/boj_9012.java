package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int t = 0; t < N; t++) {
            String str = br.readLine();
            int count = 0;
            boolean flag = true;
            for(int i = 0; i <str.length(); i++) {
                if(count < 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                else if(str.charAt(i) == '(') count++;
                else if(str.charAt(i) == ')') count--;
            }

            if(flag) {
                if (count == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
