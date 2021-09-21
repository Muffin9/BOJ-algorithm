import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List list = new ArrayList<>();

        for(int i = 0; i<str.length(); i++) {
            list.add(str.substring(i));
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(Object s : list) sb.append(s + "\n");
        System.out.println(sb);
    }
}
