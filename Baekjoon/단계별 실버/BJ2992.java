import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2992 {
    static int n;
    static int[] arr;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int result = Integer.parseInt(s);
        arr = new int[s.length()];
        int[] output = new int[arr.length];
        boolean[] v = new boolean[arr.length];
        n = arr.length;


        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int depth = 0;
        dfs(depth, result, output, v);
        if (ans == Integer.MAX_VALUE) {
            System.out.println("0");
        } else
            System.out.println(ans);

    }

    static void dfs(int depth, int result, int[] output, boolean[] v) {
        if (depth == n) {
            int sum = output[0];
            for (int i = 1; i < output.length; i++) {
                sum = (sum * 10) + output[i];
            }

            if (sum > result) {

                ans = Math.min(ans, sum);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                v[i] = true;
                output[depth] = arr[i];
                dfs(depth + 1, result, output, v);
                v[i] = false;
            }
        }
    }


}

