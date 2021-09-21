import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while ((str = br.readLine()) != null ) {
            int smallLetterCount = 0;
            int bigLetterCount = 0;
            int numberCount = 0;
            int blankCount = 0;
            for(int j = 0; j<str.length(); j++) {
                if(str.charAt(j) >= 'a' && str.charAt(j) <= 'z') smallLetterCount +=1;
                else if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') bigLetterCount +=1;
                else if(str.charAt(j) >= '0' && str.charAt(j) <= '9') numberCount +=1;
                else if(str.charAt(j) == ' ') blankCount +=1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(smallLetterCount + " ");
            sb.append(bigLetterCount + " ");
            sb.append(numberCount + " ");
            sb.append(blankCount + " ");

            System.out.println(sb);
        }
        br.close();
    }
}
