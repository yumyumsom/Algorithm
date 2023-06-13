import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N + 1];
        sum[1] = arr[0];
        int cnt = 0;
        for (int i = 2; i < N + 1; i++) {
            sum[i] = arr[i-1] + sum[i - 1];
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N+1; j++) {
                if (sum[j] - sum[i] == M) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
