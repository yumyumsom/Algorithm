import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[T+2];
        int[] arr = new int[T+2];
        int max = 0;
        for (int t = 0; t < T; t++) {
            arr[t] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[1] + arr[0];
        dp[2] = Math.max(Math.max(arr[0],arr[1])+arr[2],dp[1]);

        max = dp[2];
        for (int i = 3; i <= T; i++) {
            dp[i] = Math.max(Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]), dp[i - 1]);

            max = Math.max(dp[i], max);
        }
        System.out.println(max);
    }
}

