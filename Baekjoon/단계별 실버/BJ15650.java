import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15650 {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] ans = new int[M];
        boolean[] v = new boolean[N];

        dfs(v, ans, 0, 0);
        System.out.println(sb);

    }

    static void dfs(boolean[] v, int[] ans, int depth, int start) {

        if (M == depth) {
            for (int i = 0; i < ans.length; i++) {
                sb.append(ans[i] + " ");
            }
            sb.append("\n");

            return;
        } else {
            for (int i = start; i < N; i++) {
                if (v[i] == false) {
                    v[i] = true;
                    ans[depth] = i + 1;
                    dfs(v, ans, depth + 1, i + 1);
                    v[i] = false;
                }
            }
        }
    }
}
