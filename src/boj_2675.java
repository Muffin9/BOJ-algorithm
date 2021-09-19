    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class boj_2675 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++) {
                String str = br.readLine();
                String newStr = "";
                StringTokenizer st = new StringTokenizer(str);
                int num = Integer.parseInt(st.nextToken());
                String[] s = st.nextToken().split("");

                for(int j = 0; j < s.length; j++) {
                    for(int k = 0; k < num; k++) {
                        newStr += s[j];
                    }
                }
                System.out.println(newStr);
            }
        }
    }
