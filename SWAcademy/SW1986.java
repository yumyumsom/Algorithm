package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    ans -= i;
                } else {
                    ans += i;
                }
            }
            sb.append("#" + t + " " + ans + "\n");
        }
        System.out.print(sb);
    }
}

