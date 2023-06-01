import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ15312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] spell = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        String A = br.readLine();
        String B = br.readLine();

        int[] a = new int[A.length()];
        int[] b = new int[B.length()];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = A.charAt(i) - 65;
            b[i] = B.charAt(i) - 65;
        }


        for (int i = 0; i < 26; i++) {
            map.put(i, spell[i]);
        }


        int[][] dp = new int[n * 2 - 1][n * 2];

        int idx = 0;
        for (int i = 0; i < n * 2; i += 2) {
            dp[0][i] = map.get(a[idx++]);
        }

        idx = 0;
        for (int i = 1; i < n * 2; i += 2) {
            dp[0][i] = map.get(b[idx++]);
        }

        int sum = 0;
        for (int i = 1; i < n * 2 - 1; i++) {
            for (int j = 0; j < (n * 2) - i; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j + 1]) % 10;

            }
        }
        System.out.println(String.valueOf(dp[2 * n - 2][0]) + String.valueOf(dp[2 * n - 2][1]));
    }
}