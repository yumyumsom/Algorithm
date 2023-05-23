import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BJ6603 {
    static int k;
    static int[] output;
    static int[] S;
    static boolean[] v;
    static int start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                return;
            }
            S = new int[k];
            for (int i = 0; i < k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }
            int depth = 0;
            start = 0;
            v = new boolean[k];
            output = new int[6];
            dfs(depth, start, output, v);
            System.out.println();
        }
    }

    static void dfs(int depth, int start, int[] output, boolean[] v) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(output[i] + " ");

            }
            System.out.println();
        } else {
            for (int i = start; i < k; i++) {
                if (!v[i]) {
                    v[i] = true;
                    output[depth] = S[i];
                    dfs(depth + 1, i + 1, output, v);
                    v[i] = false;


                }
            }
        }
    }
}
