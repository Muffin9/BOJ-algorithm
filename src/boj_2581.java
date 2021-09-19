import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value1 = Integer.parseInt(br.readLine());
        int value2 = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i = value1; i<=value2; i++) {
            if(i == 1) continue;
            boolean isChecked = true;
            int decimal = i;
            for(int j = 2; j < decimal; j++) {
                if(decimal%j == 0) {
                    isChecked = false;
                    break;
                }
            }

            if(isChecked) {
                list.add(decimal);
            }
        }

        if(list.size() == 0) {
            System.out.println(-1);
            return;
        }

        for(Integer e: list) sum += e;

        System.out.println(sum);
        System.out.println(list.get(0));
    }
}
