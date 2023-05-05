import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ15654 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] output = new int[M];
        int[] arr = new int[N];
        boolean[] v = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(output, arr, v, 0);
        System.out.println(sb);
    }

    static void dfs(int[] output, int[] arr, boolean[] v, int depth) {
        if (M == depth) {
            for (int i = 0; i < M; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (v[i] == false) {
                    v[i] = true;
                    output[depth] = arr[i];
                    dfs(output, arr, v, depth + 1);
                    v[i] = false;
                }

            }
        }
    }
}
