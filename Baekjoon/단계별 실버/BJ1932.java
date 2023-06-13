import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] tree = new int[N][N];
        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                tree[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = tree[0][0];

        int max = dp[0][0];
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j - 1 >= 0) {
                    dp[i][j] = dp[i - 1][j - 1] + tree[i][j];
                }
                dp[i][j] = Math.max(dp[i - 1][j] + tree[i][j], dp[i][j]);

                max = Math.max(dp[i][j], max);
            }

        }
        System.out.println(max);
    }
}
