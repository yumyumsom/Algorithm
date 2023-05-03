import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            sb.append("#" + t + "\n");
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String c = st.nextToken();
                int k = Integer.parseInt(st.nextToken());
                for (int j = 0; j < k; j++) {
                    cnt++;
                    if (cnt % 10 == 0) {
                        sb.append(c).append("\n");
                    } else {
                        sb.append(c);
                    }
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
