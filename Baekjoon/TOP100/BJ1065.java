import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;


        for (int i = 1; i <= N; i++) {
            if (i >= 1 && i <= 99) {
                cnt++;
            } else {
                int a = i / 100;
                int b = i / 10;
                b = b % 10;
                int c = i % 10;

                if ((c - b) == (b - a)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
