import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15650 {

    static int[] result;

    static void recur(int index, int selected, int N, int M) {
        if (selected == M) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
            return;
        }

        if(index > N) return;
        result[selected] = index;
        recur(index+1, selected+1, N, M); // index를 결과에 추가
//        result[selected] = 0;
        recur(index+1, selected, N, M); // index를 결과에 추가하지 않음
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        result = new int[M];

        recur(1,0, N, M);
    }
}
