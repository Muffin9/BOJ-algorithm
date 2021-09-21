import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        List list = new ArrayList<>();
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        while(list.size() != 1) {
            for(int i = 0; i < K-1; i++) {
                list.add(list.get(0));
                list.remove(0);
            }
            sb.append((int) list.get(0) + ", ");
            list.remove(0);
        }

        sb.append(list.get(0) + ">");

        br.close();
        System.out.println(sb);
    }
}
