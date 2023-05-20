import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2961 {
    static int N;
    static int ans = Integer.MAX_VALUE;
    static int[] S;
    static int[] B;
    static boolean[] v;
    static int depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        B = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
        int Ssum = 1;
        int Bsum = 0;
        depth = 0;
        int start = 0;
        v = new boolean[N];
        dfs(depth, start, v, Ssum, Bsum);
        System.out.println(ans);
    }

    static void dfs(int depth, int start, boolean[] v, int Ssum, int Bsum) {
        if (depth > 0) {
            ans = Math.min(ans, Math.abs(Ssum - Bsum));
        }
        for (int i = start; i < N; i++) {
            if (!v[i]) {
                v[i] = true;
                dfs(depth + 1, i + 1, v, Ssum * S[i], Bsum + B[i]);
                v[i] = false;
            }
        }
    }
}
