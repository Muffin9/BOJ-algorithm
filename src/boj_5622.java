import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int time = 0;
        for(int i = 0; i<st.length(); i++) {
            if(st.charAt(i) >= 'A' && st.charAt(i) <= 'C') time += 3;
            else if(st.charAt(i) >= 'D' && st.charAt(i) <= 'F') time += 4;
            else if(st.charAt(i) >= 'G' && st.charAt(i) <= 'I') time += 5;
            else if(st.charAt(i) >= 'J' && st.charAt(i) <= 'L') time += 6;
            else if(st.charAt(i) >= 'M' && st.charAt(i) <= 'O') time += 7;
            else if(st.charAt(i) >= 'P' && st.charAt(i) <= 'S') time += 8;
            else if(st.charAt(i) >= 'T' && st.charAt(i) <= 'V') time += 9;
            else if(st.charAt(i) >= 'W' && st.charAt(i) <= 'Z') time += 10;
        }
        System.out.println(time);
    }
}
