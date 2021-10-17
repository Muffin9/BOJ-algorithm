/*
.F.F...F
F...F.F.
...F.F.F
F.F...F.
.F...F..
F...F.F.
.F.F.F.F
..FF..F.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1100 {
    public static void main(String[] args) throws IOException {
        String[][] arr = new String[8][8];
        int whiteCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i < 8; i++) {
            String str = br.readLine();
            int index = 0;
            for(int j = 0; j < 8; j++) {
                arr[i][j] = String.valueOf(str.charAt(index));
                index++;
            }
        }

        for(int i = 0 ; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(i % 2 == 0 && j % 2 == 0 && arr[i][j].equals("F")) {
                    whiteCount++;
                } else if(i % 2 == 1  && j % 2 == 1 && arr[i][j].equals("F")) {
                    whiteCount++;
                }
            }
        }

        System.out.println(whiteCount);
    }
}
