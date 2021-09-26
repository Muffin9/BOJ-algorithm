import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_17087 {

    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int S = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        int index = 0;

        while(st2.hasMoreTokens()) {
            arr[index] = Math.abs(S-Integer.parseInt(st2.nextToken()));
            index++;
        }

        int result = arr[0];
        for(int i = 1; i<arr.length; i++) {
            result = getGCD(result, arr[i]);
        }

        br.close();
        System.out.println(result);
    }
}
