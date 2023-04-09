import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//다리놓기
public class BJ1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30];

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= M; i++) {
                dp[1][i] = i;
            }

            for (int i = 2; i < N+1 ; i++) {
                for (int j = i ; j < M + 1; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }
            sb.append(dp[N][M]).append("\n");

        }
        System.out.println(sb);
    }


}
