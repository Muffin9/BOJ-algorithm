import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int max = arr[0];
        int min = arr[0];

        int currentIndex = 1;
        // N의 값 도출하기
        br.close();
        while(--A > 0) {
            if(arr[currentIndex] > max) max = arr[currentIndex];
            if(arr[currentIndex] < min) min = arr[currentIndex];
            currentIndex++;
        }

        System.out.println(max * min);

    }
}
