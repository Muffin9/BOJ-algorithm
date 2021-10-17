import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_17413 {
    static StringBuilder sb = new StringBuilder();
    static void print(Stack<Character> stk) {
        while(!stk.empty()) {
            sb.append(stk.pop());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stk = new Stack<>();
        boolean tag = false;

        for(int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if(ch == '<') {
                print(stk);
                tag = true;
                sb.append(ch);
            } else if(ch == '>') {
                tag = false;
                sb.append(ch);
            } else if(tag) {
                sb.append(ch);
            } else {
                if(ch == ' ') {
                    print(stk);
                    sb.append(ch);
                } else {
                    stk.push(ch);
                }
            }
        }

        print(stk);

        System.out.println(sb);
    }
}
