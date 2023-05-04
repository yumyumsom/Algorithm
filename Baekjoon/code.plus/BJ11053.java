import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] check = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            check[i] = 1;
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (num[j] < num[i]) {
                    max = Math.max(check[j], max);
                }
            }
            check[i] += max;
        }
        int ans = check[0];
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, check[i]);
        }
        System.out.println(ans);
    }
}