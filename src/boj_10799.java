import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택의 크기가 레이저가 자르는 쇠막대기의 개수와 같다.
public class boj_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> bracket = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();

        int result = 0;

        for(int i = 0; i<str.length(); i++) {
            Character c = str.charAt(i);
            if(c.equals('(')) {
                indexStack.push(i);
            } else if(c.equals(')')) {
                if(indexStack.peek() == i-1) {
                    indexStack.pop();
                    result += indexStack.size();
                } else {
                    indexStack.pop();
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
