import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        for(int i = 0; i<str.length(); i++){
            int index = 0;
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                int count = (int)str.charAt(i);
                while(true) {
                    if(index == 13) {
                        result += (char) (count);
                        break;
                    }
                    if(count == 122) count = 96;
                    count++;
                    index++;
                }
            } else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                int count = (int) str.charAt(i);
                while(true) {
                    if(index == 13) {
                        result += (char) (count);
                        break;
                    }
                    if(count == 90) count = 64;
                    count++;
                    index++;
                }
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
