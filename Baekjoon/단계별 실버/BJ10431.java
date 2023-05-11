import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int[] num = new int[20];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            for (int i = 0; i < num.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (num[j] > num[i]) {
                        cnt++;
                    }
                }
            }
            sb.append(t).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
