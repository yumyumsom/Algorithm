import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int B[] = new int[N];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(A);
        Arrays.sort(B);


        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i] * B[N-1-i];
        }
        System.out.println(ans);
    }
}
