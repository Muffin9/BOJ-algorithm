package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();int count = 0;

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num > count) {
                while(num > count) {
                    stack.push(++count);
                    sb.append("+" + "\n");
                }
                stack.pop();
                sb.append("-" + "\n");
            }
            else {
                boolean check = false;
                if (!stack.empty()) {
                    int stackTop = stack.peek();
                    stack.pop();
                    sb.append("-" + "\n");
                    if(num == stackTop) check = true;
                }
                if(!check) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(sb);
    }
}
