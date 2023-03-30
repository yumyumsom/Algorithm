import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int f[] = new int[11];
        f[1] = 1;
        f[2] = 2;
        f[3] = 4;

        for (int i = 4; i < 11; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(f[N]);
        }
    }
}