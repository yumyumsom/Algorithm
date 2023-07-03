import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            rank[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rank);
        int num = (int) Math.round(N * 0.15);
        double ans = 0;

        for (int i = num; i < N-num; i++) {
            ans += rank[i];
        }

        System.out.println((int) Math.round(ans / (N - (num * 2))));
    }
}