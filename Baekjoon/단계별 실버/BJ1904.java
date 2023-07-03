import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//01타일
public class BJ1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[1_000_001];
        long ans = 0;

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        if (N > 3) {
            for (int i = 3; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
                dp[i] %= 15746;
            }
        }
        System.out.println(dp[N]);
    }
}
