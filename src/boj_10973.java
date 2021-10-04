import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10973 {
    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static void previousPermutation(int[] arr, int N) {
        int i = N-1;
        while (i > 0 && arr[i-1] <= arr[i]) i-=1;
        if(i <= 0) {
            System.out.println(-1);
            return;
        }

        int j = N-1;
        while(arr[j] >= arr[i-1]) j-=1;
        swap(arr, i-1, j);

        j = N-1;

        while(i < j) {
            // 순열대로 정렬하기 위하여 나머지 뒤집는 부분
            swap(arr, i, j);
            i+=1;
            j-=1;
        }

        for(int k=0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        previousPermutation(arr, N);
    }
}
