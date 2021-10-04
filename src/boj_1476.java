import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int countE = 1;
        int countS = 1;
        int countM = 1;

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year = 1;

        while(true) {
            if(countE == E && countS == S && countM == M) {
                System.out.println(year);
                break;
            }

            countE += 1;
            countS += 1;
            countM += 1;

            if(countE == 16) countE = 1;
            if(countS == 29) countS = 1;
            if(countM == 20) countM = 1;

            year += 1;
        }
    }
}
