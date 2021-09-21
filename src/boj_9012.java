import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String[] arr = br.readLine().split("");
            boolean flag = true;
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(count < 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
                if(arr[j].equals("(")) {
                    count+=1;
                } else if(arr[j].equals(")")) {
                    count-=1;
                }
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
