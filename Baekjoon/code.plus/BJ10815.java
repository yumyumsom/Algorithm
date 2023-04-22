import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] ans = new int[M];
        for (int i = 0; i < M; i++) {
            int find_num = Integer.parseInt(st.nextToken());
            if (find(cards, N, find_num)) {
                ans[i] = 1;
            }

        }
        for (int i = 0; i < ans.length; i++) {

            sb.append(ans[i]+" ");
        }

        System.out.print(sb);
    }

    static boolean find(int cards[], int N, int find_num) {

        int start = 0;
        int end = N-1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (cards[mid] > find_num) {
                end = mid - 1;
            } else if (cards[mid] < find_num) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}