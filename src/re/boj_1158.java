package re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 배열의 길이가 계속해서 변경하므로 list를 사용하여 K번째 값들으 계속해서 제거해주며
// K번째 요소 제거 이후에 K번째 이전의 원소들은 다시 맨 뒤에 위치하도록 구현하였다.
public class boj_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
    }
}
