package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// List를 활용을 하면 cursor 위치별로 쉽게 값들을 add, remove를 할 수 있어서 작성했지만 시간초과 발생..
// 해당 문제는 add, remove를 처리하는데 있어서 해당 cursor에 바로 접근하는게 아닌 순서대로 접근하여 시간초과가 발생하였다. B, P 연산의 시간복잡도 -> O(N)

public class boj_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List arr = new ArrayList();
        Arrays.stream(br.readLine().split("")).forEach(item -> arr.add(item));
        int M = Integer.parseInt(br.readLine());
        int cursor = arr.size();

        while(M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String alpha = st.nextToken();
            switch(alpha) {
                case "L":
                    if(cursor != 0) cursor--;
                    break;
                case "D":
                    if(cursor != arr.size()) cursor++;
                    break;
                case "B":
                    if(cursor != 0) {
                        arr.remove(cursor-1);
                        cursor--;
                    }
                    break;
                case "P":
                    arr.add(cursor, st.nextToken());
                    cursor++;
                    break;
            }
        }

        br.close();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<arr.size(); i++) {
            sb.append(arr.get(i));
        }
        System.out.println(sb);

    }
}
