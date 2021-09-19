import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 답은 맞았지만 더 효율적인 방법 없을까 ?
public class boj_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        int count = 0;
        for(int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for(int i = 0; i < str.length; i++) {
            String[] newArr = str[i].split("");
            boolean flag = true;
            if(newArr.length == 1) {
                count+=1;
                continue;
            }
            for(int j = 0; j < newArr.length; j++) {
                String saveChar = newArr[j];
                for(int k = j+1; k<newArr.length; k++) {
                    if(saveChar.equals(newArr[k])) {
                        if(!newArr[k-1].equals(saveChar)) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag) count++;
        }
        System.out.println(count);
    }
}
