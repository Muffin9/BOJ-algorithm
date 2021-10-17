package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        List list = new ArrayList();
        int count = 0;
        sb.append("<");
        int index = 1;
        for(int i = 0; i<N; i++) {
            list.add(index);
            index++;
        }

        while(count != N) {
            for(int i = 0; i<K-1; i++) {
                list.add(i);
            }
            count++;
        }
    }
}
