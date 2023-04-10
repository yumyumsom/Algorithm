import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] F = new int[N + 1];

        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < N + 1; i++) {
            F[i] = F[i - 2] + F[i - 1];
        }

        System.out.println(F[N]);
    }
}
