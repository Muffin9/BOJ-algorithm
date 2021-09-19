import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];
        int[] height = new int[N];
        int[] grade = new int[N];
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < N; j++) {
                if(weight[i] < weight[j] && height[i] < height[j]) {
                    count+=1;
                }
            }
            grade[i] = count+1;
        }

        for(int i = 0; i < N; i++) {
            if(i == N-1) {
                result.append(grade[i]);
                break;
            }
            result.append(grade[i]);
            result.append(" ");
        }

        System.out.println(result);
    }
}
