import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_6588 {

    public static final int MAX = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isNotPrime = new boolean[MAX + 1];

        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i < MAX; i++) {
            if (isNotPrime[i] == false) {
                for (int j = i + i; j <= MAX; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        while(true) {
            int value = Integer.parseInt(br.readLine());
            if(value == 0) return;
            for(int i = 3; i < value; i++) {
                if(isNotPrime[i] == false) {
                    int n1 = i;
                    if(isNotPrime[value - n1] == false) {
                        int n2 = value - n1;
                        System.out.println(value + " = " + n1 + " + " + n2);
                        break;
                    }
                }
            }
        }
    }
}
