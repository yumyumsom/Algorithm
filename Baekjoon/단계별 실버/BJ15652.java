import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15652 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] ans = new int[M];
        dfs(ans, 0, 0);
        System.out.println(sb);

    }

    static void dfs(int[] ans, int depth, int start) {
        if (M == depth) {
            for (int i = 0; i < ans.length; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");

            return;
        }
        for (int i = start; i < N; i++) {

            ans[depth] = i + 1;
            dfs(ans, depth + 1, i);

        }

    }

}
