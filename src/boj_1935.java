import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_1935 {
    public static void main(String[] args) throws IOException {
        // 후위 표기식이란 피연산자 뒤에 연산자가 오는 방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Double> stack = new Stack<>();
        Double[] num = new Double[N];
        String str = br.readLine();

        for(int i = 0; i<num.length; i++) {
            num[i] = Double.parseDouble(br.readLine());
        }

        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int value = str.charAt(i) - 65;
                stack.push(num[value]);
            } else {
                Double num1 = stack.pop();
                Double num2 = stack.pop();
                Character operator = str.charAt(i);
                switch (operator) {
                    case '+':
                        stack.push(num2 + num1);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num2 * num1);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
            System.out.println(stack);
        }
        System.out.println(String.format("%.2f", stack.pop()));

    }
}
