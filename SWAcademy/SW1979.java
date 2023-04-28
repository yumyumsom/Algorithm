package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] puzzle = new int[N + 1][N + 1];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for (int i = 0; i < N + 1; i++) {
                int rSum = 0, cSum = 0;
                for (int j = 0; j < N + 1; j++) {
                    if (puzzle[i][j] == 0) {
                        if (rSum == K) {
                            cnt++;
                        }
                        rSum = 0;
                    } else {
                        rSum++;
                    }

                    if (puzzle[j][i] == 0) {
                        if (cSum == K) {
                            cnt++;
                        }
                        cSum = 0;

                    } else {
                        cSum++;
                    }

                }
            }
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb);
    }
}