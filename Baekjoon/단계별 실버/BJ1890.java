import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1890 {
    //점프, 실버1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N + 1][N + 1];
        long[][] dp = new long[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N + 1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = 1;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (i == N && j == N) {
                    continue;
                }
                int next = map[i][j];
                if (i + next < N + 1) {
                    dp[i + next][j] += dp[i][j];
                }
                if (j + next < N + 1) {
                    dp[i][j + next] += dp[i][j];
                }
            }

        }
        System.out.println(dp[N][N]);

    }
}
