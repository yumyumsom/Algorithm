import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] M = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            M[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(M);
        int start = 0;
        int end = N - 1;
        int cnt = 0;
        int X = Integer.parseInt(br.readLine());

        while (start < end) {
            int sum = M[start] + M[end];

            if (sum == X) {
                cnt++;
                start++;
                end--;
            } else if (sum < X) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(cnt);
    }
}
