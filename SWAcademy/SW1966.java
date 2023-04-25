import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] ans = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                ans[i] = Integer.parseInt(st.nextToken());

            }
            Arrays.sort(ans);
            sb.append("#" + tc + " ");

            for (int i = 0; i < ans.length; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
