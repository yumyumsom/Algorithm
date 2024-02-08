import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//그리디
public class BJ1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                arr[A - 1] = B;
            }

            int cnt = 1;
            int rate = arr[0];
            for (int i = 1; i < N; i++) {
                if (rate > arr[i]) {
                    cnt++;
                    rate = arr[i];
                }
            }
            sb.append(cnt +"\n");
        }
        System.out.println(sb);
    }
}