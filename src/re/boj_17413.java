package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj_17413 {
    static String result = "";
    static String saveString = "";
    static void print(boolean flag) {
        if(flag) {
            result += saveString;
        } else {
            for(int i =saveString.length()-1; i >= 0; i--)
            result += saveString.charAt(i);
        }
        saveString = "";
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        boolean flag = false;

        for(int i = 0; i<S.length(); i++) {
            Character ch = S.charAt(i);
            if(ch.equals('<')) {
                print(false);
                result += '<';
                flag = true;
            } else if(ch.equals('>')) {
                result += '>';
                flag = false;
            }

            else if(flag) {
               result += ch;
            } else {
                if(ch.equals(' ')) {
                    print(false);
                    result += ' ';
                } else {
                    saveString += ch;
                }
            }
        }

        print(false);

        System.out.println(result);

    }
}
