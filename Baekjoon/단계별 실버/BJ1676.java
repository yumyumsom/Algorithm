import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt2 = 0;
        int cnt5 = 0;

        for (int i = 1; i <= N; i++) {
            int tmp = i;
            while (tmp % 2 == 0) {
                tmp/=2;
                cnt2++;
            }
            while (tmp % 5 == 0) {
                tmp/=5;
                cnt5++;
            }
        }
        System.out.println(Math.min(cnt2,cnt5));
    }
}
