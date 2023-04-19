import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[2][N + 1];

        for (int i = 1; i < N + 1; i++) {

            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            arr[0][i] = T;
            arr[1][i] = P;

        }
        int cnt=0;
        int[] max = new int[N + 1];
        for (int i = N; i > 0; i--) {
            if (i + arr[0][i] <= N+1) {
                max[i] = arr[1][i];
            }

            int tmp = 0;
            for (int j = i+1; j < N + 1; j++) {
                if (arr[0][i] + i <= j) {
                    tmp = Math.max(max[j], tmp);
                }
            }
            max[i] = max[i] + tmp;
            cnt = Math.max(max[i],cnt);
        }
        System.out.println(cnt);

    }
}
