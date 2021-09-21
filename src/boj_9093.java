import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        String[] result = new String[N];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            arr[i] = str;
        }

        for(int i = 0; i < arr.length; i++) {
            String[] arr2 = arr[i].split(" ");
            for(int j = 0; j < arr2.length; j++) {
                String reverse = "";
                for(int k = arr2[j].length()-1; k >= 0; k--) {
                    reverse = reverse + arr2[j].charAt(k);
                }
                arr2[j] = reverse;
            }
            result[i] = String.join(" ", arr2);
        }

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
