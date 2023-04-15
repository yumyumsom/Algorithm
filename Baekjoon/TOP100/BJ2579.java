import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N + 2];
        int[] arr = new int[N + 2];

        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max((arr[0] + arr[2]), (arr[1] + arr[2]));

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max((dp[i - 3] + arr[i] + arr[i - 1]), (dp[i - 2] + arr[i]));

        }
        System.out.println(dp[N - 1]);
    }
}