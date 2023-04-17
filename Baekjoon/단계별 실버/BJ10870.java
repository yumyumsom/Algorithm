import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] fn = new int[n + 1];

        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            fn[0] = 0;
            fn[1] = 1;
            for (int i = 2; i < n + 1; i++) {
                fn[i] = fn[i - 1] + fn[i - 2];
            }
            System.out.println(fn[n]);
        }
    }
}


