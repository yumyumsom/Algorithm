import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ15651 {
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] output = new int[M];

        dfs(output, 0);
        System.out.println(sb);

    }

    static void dfs(int[] output, int depth) {
        if (M == depth) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 0; i < N; i++) {
                output[depth] = i+1;
                dfs(output, depth + 1);
            }

        }
    }
}

