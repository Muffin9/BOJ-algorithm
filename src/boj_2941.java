import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 오답
public class boj_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        int count = 0;

        List<String> list = new ArrayList<>();

        for(int i = 0; i < str.length ; i++) {
            list.add(str[i]);
        }

        if(list == null || list.size() == 0) {
            System.out.println(count);
            return;
        }

        while(true) {
            if(list.size() == 0) {
                System.out.println(count);
                return;
            }

            if(list.size() == 1) {
                System.out.println(count + 1);
                return;
            }

            String standard = list.remove(0);

            if(standard.equals("c")) {
                String s2 = list.remove(0);
                if(s2.equals("=") || s2.equals("-")) count+=1;
                else {
                    count+=1;
                    list.add(0, s2);
                }
            } else if(standard.equals("d")) {
                String s2 = list.remove(0);
                if(s2.equals("z")) {
                    String s3 = list.remove(0);
                    if(s3.equals("=")) {
                        count+=1;
                    } else {
                        list.add(0, s3);
                        list.add(0, s2);
                    }
                } else if(s2.equals("-")) {
                    count+=1;
                } else {
                    count+=1;
                    list.add(0, s2);
                }
            } else if(standard.equals("l") || standard.equals("n")) {
                String s2 = list.remove(0);
                if(s2.equals("j")) count+=1;
                else {
                    count+=1;
                    list.add(0, s2);
                }
            } else if(standard.equals("s") || standard.equals("z")) {
                String s2 = list.remove(0);
                if(s2.equals("=")) count+=1;
                else {
                    count += 1;
                    list.add(0, s2);
                }
            } else {
                count+=1;
            }
        }
    }
}
