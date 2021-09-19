import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuffer a = new StringBuffer(st.nextToken()).reverse();
        StringBuffer b = new StringBuffer(st.nextToken()).reverse();

        if(Integer.parseInt(a.toString()) > Integer.parseInt(b.toString())) System.out.println(Integer.parseInt(a.toString()));
        else System.out.println(Integer.parseInt(b.toString()));
    }
}
