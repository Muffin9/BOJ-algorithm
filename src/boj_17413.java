import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stk = new Stack<>();
        boolean inout = false;

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '<') {
                inout = true;

                while(!stk.isEmpty()){
                    System.out.print(stk.pop());
                }
                System.out.print(s.charAt(i));
            }
            else if(s.charAt(i) == '>') {
                inout = false;
                System.out.print(s.charAt(i));
            }

            else if(inout) {
                System.out.print(s.charAt(i));
            }

            else if(!inout) {
                if(s.charAt(i) == ' ') {
                    while(!stk.isEmpty()) {
                        System.out.print(stk.pop());
                    }

                    System.out.print(s.charAt(i));
                } else {
                    stk.push(s.charAt(i));
                }
            }
        }

        while(!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
        br.close();
    }
}
