import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj_14612 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<int []> tableList = new ArrayList<>();

        for(int T = 0; T<N; T++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            String command = st2.nextToken();
            switch(command) {
                case "order":
                    int n = Integer.parseInt(st2.nextToken());
                    int t = Integer.parseInt(st2.nextToken());
                    tableList.add(new int[]{n, t});
                    break;
                case "sort":
                   Collections.sort(tableList, new Comparator<int[]>() {
                       @Override
                       public int compare(int[] o1, int[] o2) {
                           return o1[1] - o2[1];
                       }
                   });
                   break;
                case "complete":
                    int c = Integer.parseInt(st2.nextToken());
                    for(int i = 0; i<tableList.size(); i++) {
                        if(tableList.get(i)[0] == c) {
                            tableList.remove(i);
                            break;
                        }
                    }
            }

            if(tableList.isEmpty()) {
                System.out.println("sleep");
            } else {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < tableList.size(); i++){
                    sb.append(tableList.get(i)[0]);
                    if(i < tableList.size()-1) {
                        sb.append(" ");
                    }
                }
                System.out.println(sb);
            }
        }
    }
}
