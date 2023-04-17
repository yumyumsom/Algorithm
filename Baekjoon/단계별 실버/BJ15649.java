import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15649 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        boolean[] v = new boolean[N];
        int[] output = new int[M];
        int len = 0;

        dfs(v, output, len);
        System.out.println(sb);


    }

    static void dfs(boolean[] v, int[] output, int len) {
        if (len == M) {
            for (int i =0; i<M; i++){
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!v[i]) {
                v[i] = true;
                output[len] = i + 1;
                dfs(v, output, len + 1);
                v[i] = false;
            }
        }


    }
}

