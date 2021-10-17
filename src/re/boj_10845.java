package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> queue = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command) {
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.get(0) + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.get(queue.size()-1) + "\n");
                    }
                    break;
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        int value = queue.remove(0);
                        sb.append(value + "\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}
