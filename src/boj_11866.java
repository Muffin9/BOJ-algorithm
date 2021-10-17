import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= N; i++) {
            list.add(i);
        }

        while(list.size() != 1) {
            for(int j = 0; j<list.size(); j++) {
                System.out.print(list.get(j)+", ");
            }
            System.out.println();
            for(int i = 0; i < K-1; i++) {
                list.add(list.get(0));
                list.remove(0);
            }
            sb.append(list.get(0) + ", ");
            list.remove(0);
        }

        sb.append(list.get(0) + ">");
        System.out.println(sb);

    }
}
