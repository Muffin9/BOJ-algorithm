package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String[] strArr = new String[st.countTokens()];

            for(int i = 0; i<strArr.length; i++) {
                strArr[i] = st.nextToken();
            }

            for(int i = 0; i<strArr.length; i++) {
                String reverse = "";
                for(int j = strArr[i].length()-1; j>=0; j--) {
                    reverse += strArr[i].charAt(j);
                }
                strArr[i] = reverse;
            }

            for(int i = 0; i< strArr.length; i++) {
                System.out.print(strArr[i] + " ");
            }
        }
    }
}
