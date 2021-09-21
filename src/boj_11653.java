import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==1) return;
        List<Integer> list = new ArrayList<>();

        while(true) {
            int index = 2;
            for(int i = index; i<N; i++) {
                if(N % i == 0) {
                    list.add(i);
                    N/=i;
                    break;
                }
                index++;
            }
            if(index == N) {
                list.add(index);
                break;
            }
        }

        for(Integer element: list) {
            System.out.println(element);
        }
    }
}
