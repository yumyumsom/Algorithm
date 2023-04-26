package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());

            int building[] = new int[N];
            int ans = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                building[i] = Integer.parseInt(st.nextToken());
            }

            for (int j = 2; j < N - 2; j++) {
                int max = Math.max(Math.max(building[j - 1], building[j - 2]), Math.max(building[j + 1], building[j + 2]));
                if (building[j] > max) {
                    ans += building[j] - max;
                }
            }
            sb.append("#" + tc + " " + ans + "\n");
        }

        System.out.println(sb);
    }
}