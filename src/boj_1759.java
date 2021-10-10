import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1759 {
    static boolean check(String password) {
        int Consonant = 0;
        int collection = 0;
        for(int i = 0; i<password.length(); i++) {
            if(password.charAt(i) == 'a' || password.charAt(i) == 'e' || password.charAt(i) == 'i' || password.charAt(i) == 'o' || password.charAt(i) == 'u') {
                collection++;
            } else {
                Consonant++;
            }
        }
        return (Consonant >= 2 && collection >=1) ? true : false;
    }

    static void recur(int L, String[] alpha, String password, int index) {
        if(password.length() == L) {
            if(check(password)) {
                System.out.println(password);
            }
            return;
        }

        if(index >= alpha.length) return;
        recur(L, alpha, password+alpha[index], index+1);
        recur(L, alpha, password, index+1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        String[] alpha = new String[C];
        String password = "";

        for(int i = 0; i<C; i++) {
            alpha[i] = st2.nextToken();
        }

        Arrays.sort(alpha);
        recur(L, alpha, password, 0);

    }
}
