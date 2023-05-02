import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW10505 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int x = 1; x <= T; x++) {
            int N = Integer.parseInt(br.readLine());
            int[] sal = new int[N];
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            int avg = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                sal[i] = Integer.parseInt(st.nextToken());
                sum += sal[i];
            }
            avg = sum / N;

            for (int i = 0; i < sal.length; i++) {
                if (sal[i] <= avg) {
                    cnt++;
                }

            }
            System.out.println("#"+x+" "+cnt);

        }
    }
}
