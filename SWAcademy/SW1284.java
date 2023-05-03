import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int A = p * w;
            int B = q;
            B = q + (s * (w - r));

            if (w < r) {
                B = q;
            }

            if (A > B) {
                System.out.println("#" + t + " " + B);
            } else {
                System.out.println("#" + t + " " + A);
            }
        }
    }
}

/*

 * p*w
 * q+(s*(w-r)) (if w<r : q)

 * */