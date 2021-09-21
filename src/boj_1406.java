import java.io.*;
import java.util.*;

public class boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 커서의 왼쪽에 있는 문자들과 커서의 오른쪽에 있는 문자들을 각각 다른 스택에 담는다.
        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        Arrays.stream(br.readLine().split("")).forEach(item -> left.push(item));

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input){
                case "L": if (!left.isEmpty()) right.push(left.pop()); break;
                case "D": if (!right.isEmpty()) left.push(right.pop()); break;
                case "B": if (!left.isEmpty()) left.pop(); break;
                case "P": left.push(st.nextToken()); break; }
        }

        StringBuilder sb = new StringBuilder();
        left.forEach(item->sb.append(item));
        while (!right.isEmpty()) sb.append(right.pop());
        br.close();
        System.out.print(sb);
    }
}
