import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SW1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            boolean[] check = new boolean[10];
            int k = 1;
            int cnt = 0;
            while (true) {
                int a = N * k;
                while (a > 0) {
                    if (check[a % 10] == false) {
                        check[a % 10] = true;
                        cnt++;
                    }
                    a /= 10;
                }
                if (cnt == 10) {
                    break;
                }
                k++;
            }

            System.out.println("#" + t + " " + (N*k));
        }
    }
}