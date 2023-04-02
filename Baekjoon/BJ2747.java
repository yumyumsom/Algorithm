import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F[] = new int[46];
        int sum = 0;

        F[1] = 1;
        F[2] = 1;

        for (int i = 2; i <= N; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.println(F[N]);
    }
}
