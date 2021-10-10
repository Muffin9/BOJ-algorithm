import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14889 {
    static int[][] arr;
    static boolean[] visit;
    static int N;
    static int result = Integer.MAX_VALUE;;

    static void check() {
        int start = 0; // visit true value
        int link = 0; // visit false value

        for(int i = 1; i < N+1; i++) {
            for(int j = i+1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += arr[i][j];
                    start += arr[j][i];
                }
                else if(visit[i] == false && visit[j] == false) {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }
        }

        int min = Math.abs(start - link);
        if (min == 0) {
            System.out.println(min);
            System.exit(0);
        }
        result = Math.min(result, min);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        for(int i = 1; i < N+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j < N+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit = new boolean[N+1];

        for(int i = 1; i < N+1; i++) {
            visit[i] = true;
            for(int j = i+1; j < N; j++) {
                visit[j] = true;
                check();
                visit[j] = false;
            }
            visit[i] = false;
        }
        System.out.println(result);
    }
}
