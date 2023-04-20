import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ16194 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N + 1];
        int[] dp = new int[N + 1];


        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 1; i <= N; i++) {
            dp[i] = cards[i];
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], (cards[j] + dp[i - j]));
            }
        }

        System.out.println(dp[N]);
    }
}
