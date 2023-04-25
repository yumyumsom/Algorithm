import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());


        int[] num = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[5];
        for (int i = 0; i < 5; i++) {
            ans[i] = num[i] - (L * P);
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);
    }
}