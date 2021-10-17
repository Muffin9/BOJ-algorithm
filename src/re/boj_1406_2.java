package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

// Stack으로 값들을 제어하도록 코드를 수정하였다. ( 커서를 기준으로 커서의 왼쪽 스택, 오른쪽 스택으로 구별 )
// L, D, B, P  모든 연산이 O(1)로 해결
public class boj_1406_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> lStack = new Stack<>();
        Stack<String> rStack = new Stack<>();

        Arrays.stream(br.readLine().split("")).forEach(item -> lStack.push(item));
        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()) {
                case "L":
                    if(lStack.size() > 0) {
                        rStack.push(lStack.pop());
                    }
                    break;
                case "D":
                    if(rStack.size() > 0) {
                        lStack.push(rStack.pop());
                    }
                    break;
                case "B":
                    if(lStack.size() > 0) {
                        lStack.pop();
                    }
                    break;
                case "P":
                    lStack.push(st.nextToken());
                    break;
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();
        lStack.forEach(element -> sb.append(element));
        while(rStack.size() != 0) {
            sb.append(rStack.pop());
        }
        System.out.println(sb);
    }
}
